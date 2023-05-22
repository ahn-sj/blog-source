package codingtest;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Result {

    /*
     * Complete the 'bestInGenre' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING genre as parameter.
     *
     * Base URL: https://jsonmock.hackerrank.com/api/tvseries?page=
     */
    private static Map<String, Integer> genres = new HashMap<>();

    public static String bestInGenre(String genre) throws IOException {
        for (int i = 1; i <= 20; i++) {
            String response = getRestApiResponse(i);
            Map<Object, Object> contents = parseMap(response);
            printMap(contents);
            System.out.println(i + " >> ================");
        }
        return "ok";
    }

    private static void findGenre(String genre, Map<Object, Object> contents) throws ScriptException {
        Object data = contents.get("data");
        String[] split = data.toString().split(", ");
        System.out.println(Arrays.toString(split));

        if(contents.get("genre").equals(genre)) {
            genres.put((String) contents.get("name"), (Integer) contents.get("imdb_rating"));
        }
    }

    private static void printMap(Map<Object, Object> contents) {
        for (Map.Entry<Object, Object> entry : contents.entrySet()) {
            Object k = entry.getKey();
            Object v = entry.getValue();
            System.out.println(k.toString() + " : " + v.toString());
        }
    }

    private static Map<Object, Object> parseMap(String response) {
        Map<Object, Object> result = null;
        try {
            ScriptEngineManager sem = new ScriptEngineManager();
            ScriptEngine engine = sem.getEngineByName("javascript");

            String script = "Java.asJSONCompatible(" + response + ")";
            result = (Map<Object, Object>) engine.eval(script);
        } catch (Exception e) {
            throw new IllegalArgumentException("변환에 실패하였습니다");
        }
        return result;
    }

    private static String getRestApiResponse(int page) throws IOException {
        URL url = new URL("https://jsonmock.hackerrank.com/api/tvseries?page=" + page);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);
        conn.connect();

        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        StringBuilder sb = new StringBuilder();

        String line = "";
        while((line = br.readLine()) != null) {
            sb.append(line);
        }
        conn.disconnect();
        return sb + "";
    }

}

public class RestAPI_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String genre = bufferedReader.readLine();

        String result = Result.bestInGenre(genre);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

