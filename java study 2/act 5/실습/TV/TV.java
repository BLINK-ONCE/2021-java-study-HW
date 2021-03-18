public class TV {
    private int size;

    public TV() {
        this.size = 0;
    }

    public TV(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();
    }
    // result
    // 32인치 1024컬러
}
