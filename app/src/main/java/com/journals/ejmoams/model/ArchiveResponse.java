package com.journals.ejmoams.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArchiveResponse {


    @SerializedName("archive_year_cnt")
    private int archiveYearCnt;
    @SerializedName("status")
    private boolean status;
    @SerializedName("message")
    private String message;
    @SerializedName("archive_years")
    private List<ArchiveYearsBean> archiveYears;

    public int getArchiveYearCnt() {
        return archiveYearCnt;
    }

    public void setArchiveYearCnt(int archiveYearCnt) {
        this.archiveYearCnt = archiveYearCnt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ArchiveYearsBean> getArchiveYears() {
        return archiveYears;
    }

    public void setArchiveYears(List<ArchiveYearsBean> archiveYears) {
        this.archiveYears = archiveYears;
    }

    public static class ArchiveYearsBean {
        @SerializedName("year")
        private String year;
        @SerializedName("archive_details")
        private List<ArchiveDetailsBean> archiveDetails;

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public List<ArchiveDetailsBean> getArchiveDetails() {
            return archiveDetails;
        }

        public void setArchiveDetails(List<ArchiveDetailsBean> archiveDetails) {
            this.archiveDetails = archiveDetails;
        }

        public static class ArchiveDetailsBean {
            @SerializedName("year")
            private String year;
            @SerializedName("issue_id")
            private String issueId;
            @SerializedName("journal")
            private String journal;
            @SerializedName("vol_issue_name")
            private String volIssueName;
            @SerializedName("vol")
            private String vol;
            @SerializedName("issue")
            private String issue;
            @SerializedName("iss_type")
            private String issType;
            @SerializedName("vol_issue_url")
            private Object volIssueUrl;
            @SerializedName("date")
            private String date;

            public String getYear() {
                return year;
            }

            public void setYear(String year) {
                this.year = year;
            }

            public String getIssueId() {
                return issueId;
            }

            public void setIssueId(String issueId) {
                this.issueId = issueId;
            }

            public String getJournal() {
                return journal;
            }

            public void setJournal(String journal) {
                this.journal = journal;
            }

            public String getVolIssueName() {
                return volIssueName;
            }

            public void setVolIssueName(String volIssueName) {
                this.volIssueName = volIssueName;
            }

            public String getVol() {
                return vol;
            }

            public void setVol(String vol) {
                this.vol = vol;
            }

            public String getIssue() {
                return issue;
            }

            public void setIssue(String issue) {
                this.issue = issue;
            }

            public String getIssType() {
                return issType;
            }

            public void setIssType(String issType) {
                this.issType = issType;
            }

            public Object getVolIssueUrl() {
                return volIssueUrl;
            }

            public void setVolIssueUrl(Object volIssueUrl) {
                this.volIssueUrl = volIssueUrl;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }
    }
}
