package anime;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;


public class Main {
    public static void main(String[] args) throws IOException {
        final Gson gson = new Gson();
        URL f = new URL("https://www.arbeitnow.com/api/job-board-api");
        BufferedReader in = new BufferedReader(new InputStreamReader(f.openStream(), StandardCharsets.UTF_8));
        Job j = gson.fromJson(in, Job.class);


        for (Job.data job : j.data ) {
            System.out.println(job);
        }

    }
}
