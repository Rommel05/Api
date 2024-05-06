package anime;

import java.util.ArrayList;

public class Job {
    ArrayList<data> data;
    static class data {
        String slug;
        String company_name;
        String title;
        String description;
        boolean remote;
        String url;
        ArrayList<String> tags;
        ArrayList<String> job_types;
        String location;
        String created_at;

        @Override
        public String toString() {
            return slug + " - " + " Company: " + company_name + " - " + "Title: " + title + " - " + "Remote: " + remote + " - " + "Location: "+ location + " - " + "Tags: " + tags + " - " + "Job types: " + job_types;
        }
    }
}
