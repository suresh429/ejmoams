package com.journals.ejmoams.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EditorialBoardResponse {


    @SerializedName("status")
    private boolean status;
    @SerializedName("editorialboardcnt")
    private int editorialboardcnt;
    @SerializedName("editorialboardarr")
    private List<EditorialboardarrBean> editorialboardarr;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getEditorialboardcnt() {
        return editorialboardcnt;
    }

    public void setEditorialboardcnt(int editorialboardcnt) {
        this.editorialboardcnt = editorialboardcnt;
    }

    public List<EditorialboardarrBean> getEditorialboardarr() {
        return editorialboardarr;
    }

    public void setEditorialboardarr(List<EditorialboardarrBean> editorialboardarr) {
        this.editorialboardarr = editorialboardarr;
    }

    public static class EditorialboardarrBean {
        @SerializedName("ename")
        private String ename;
        @SerializedName("editor_description")
        private String editorDescription;

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public String getEditorDescription() {
            return editorDescription;
        }

        public void setEditorDescription(String editorDescription) {
            this.editorDescription = editorDescription;
        }
    }
}
