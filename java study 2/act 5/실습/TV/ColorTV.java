public class ColorTV extends TV{
    private int color;

    public ColorTV() {
        super(size) = 0;
        this.color = 0;
    }

    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }

    public void printProperty() {
        System.out.println(super.getSize() + "인치 " + this.color + "컬러");
    }
}
