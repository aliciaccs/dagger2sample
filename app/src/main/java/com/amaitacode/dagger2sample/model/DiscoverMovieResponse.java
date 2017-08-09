package com.amaitacode.dagger2sample.model;

import java.util.List;

/**
 * Created by Alicia Maita on 8/9/2017.
 */

public class DiscoverMovieResponse {

        private int page;
        private int total_results;
        private int total_pages;

        private List<Movie> result;


        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getTotal_results() {
            return total_results;
        }

        public void setTotal_results(int total_results) {
            this.total_results = total_results;
        }

        public int getTotal_pages() {
            return total_pages;
        }

        public void setTotal_pages(int total_pages) {
            this.total_pages = total_pages;
        }

        public List<Movie> getResult() {
            return result;
        }

        public void setResult(List<Movie> result) {
            this.result = result;
        }
}
