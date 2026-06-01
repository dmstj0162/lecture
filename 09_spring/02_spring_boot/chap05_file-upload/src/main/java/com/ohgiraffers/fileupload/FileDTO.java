package com.ohgiraffers.fileupload;

public class FileDTO {

    /*
    * 업로드 결과를 클라이언트에 JSON으로 내려주기 위한 DTO
    * 실제 파일 데이터 자체가 아니라 저장된 파일의 메타 정보를 담는다.
    * */
    private String originFileName;  // 원본 파일명
    private String savedFileName;   // 파일 저장명
    private String filePath;        // 서버에 저장된 경로
    private String fileDescription; // 사용자가 함께 보낸 파일 설명
    private long filesize;          // 파일 크기
    private String contentType;     //text/plain, image/png 같은 파일 MIME 타입

    public FileDTO() {
    }

    public FileDTO(String originFileName, String savedFileName, String filePath, String fileDescription, long filesize, String contentType) {
        this.originFileName = originFileName;
        this.savedFileName = savedFileName;
        this.filePath = filePath;
        this.fileDescription = fileDescription;
        this.filesize = filesize;
        this.contentType = contentType;
    }

    public String getOriginFileName() {
        return originFileName;
    }

    public void setOriginFileName(String originFileName) {
        this.originFileName = originFileName;
    }

    public String getSavedFileName() {
        return savedFileName;
    }

    public void setSavedFileName(String savedFileName) {
        this.savedFileName = savedFileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }

    public long getFilesize() {
        return filesize;
    }

    public void setFilesize(long filesize) {
        this.filesize = filesize;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public String toString() {
        return "FileDTO{" +
                "originFileName='" + originFileName + '\'' +
                ", savedFileName='" + savedFileName + '\'' +
                ", filePath='" + filePath + '\'' +
                ", fileDescription='" + fileDescription + '\'' +
                ", filesize=" + filesize +
                ", contentType='" + contentType + '\'' +
                '}';
    }
}
