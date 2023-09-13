package st.ejemplo;

public class item {
    private int image;
    private String titulo1;
    private String des1;

    public item(int image, String titulo1, String des1) {
        this.image = image;
        this.titulo1 = titulo1;
        this.des1 = des1;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitulo1() {
        return titulo1;
    }

    public void setTitulo1(String titulo1) {
        this.titulo1 = titulo1;
    }

    public String getDes1() {
        return des1;
    }

    public void setDes1(String des1) {
        this.des1 = des1;
    }
}
