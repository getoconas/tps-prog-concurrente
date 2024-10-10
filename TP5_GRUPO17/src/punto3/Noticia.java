package punto3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Noticia implements Runnable {
	private String url;

    public Noticia(String url) {
    	this.url = url;
    }

    @Override
    public void run() {
        try {
            String noticia = peticionHttp(url);
            String cuerpo = extraerNoticia(noticia);
            System.out.println("URL: " + url);
            System.out.println("Noticia: " + cuerpo);
            System.out.println("------------------");
        } catch (Exception e) {
        	System.out.println("Error con el link " + url);
            e.printStackTrace();
        }
    }
    
    private String peticionHttp(String link) throws Exception {
    	URL url = new URL(link);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		
		if (con.getResponseCode() != 200) {
			throw new RuntimeException("Error en la conexión " + con.getResponseCode());
		}
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(con.getInputStream()));
		StringBuilder response = new StringBuilder();
		
		String inputLine;
		
		while ((inputLine = buffer.readLine()) != null) {
			response.append(inputLine);
		}
		
		buffer.close();
		return response.toString();
    }
    
    private String extraerNoticia(String noticia) {
    	String inicioNota = "<div amp-access=\"mostrarNota\">";
		String finNota = "</div>";
		
		int inicioIndex = noticia.indexOf(inicioNota);
		int finIndex = noticia.indexOf(finNota, inicioIndex);
		
		if (inicioIndex != -1 && finIndex != -1) {
			String contenidoNota = noticia.substring(inicioIndex, finIndex);
			String contenidoDiv = contenidoNota.replaceAll("<[^>]*>", "").trim();
			return replaceText(contenidoDiv);
		}
		
		return "Error en la extraccion de la noticia";
    }
    
    private String replaceText(String txt) {
		txt = txt.replace("&#xA0;","");
		txt = txt.replace("&#x201C;", "\"");
		txt = txt.replace("&#x201D;", "\"");
		txt = txt.replace("&#x2018;", "'");
		txt = txt.replace("&#x2019;", "'");
		txt = txt.replace("&#xE1;", "a");
		txt = txt.replace("&#xE9;", "e");
		txt = txt.replace("&#xED;", "i");
		txt = txt.replace("&#xF3;", "o");
		txt = txt.replace("&#xFA;", "u");
		txt = txt.replace("&#xF1;", "ñ");
		return txt;
	}
}
