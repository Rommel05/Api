package anime;

import com.google.gson.Gson;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class EnOtroArchivo {
    public static void main(String[] args) throws IOException {
        final Gson gson = new Gson();
        URL f = new URL("https://www.arbeitnow.com/api/job-board-api");
        BufferedReader in = new BufferedReader(new InputStreamReader(f.openStream(), StandardCharsets.UTF_8));
        Job j = gson.fromJson(in, Job.class);

        FileWriter fw = new FileWriter("/home/INFORMATICA/alu10637835/IdeaProjects/ejercicios/json/src/main/java/anime/a1.txt");

        for (Job.data job : j.data ) {
            fw.write(job.toString());
            fw.write("\n");
        }
    }
}
