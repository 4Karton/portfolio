public class ZProstokat {

    private int width;
    private int height;
    private char outerSymbol;
    private char innerSymbol;
    private static int counterSquare = 0;
    private static int counterRectangle = 0;

    public ZProstokat(int width, char innerSymbol, char outerSymbol) {

        this.width = width;
        this.innerSymbol = innerSymbol;
        this.outerSymbol = outerSymbol;

    }

    public ZProstokat(int width, int height, char innerSymbol, char outerSymbol) {
        this(width, innerSymbol, outerSymbol);
        this.height = height;
    }


    public void rysuj() throws ZProstokatException {

        if (width != height && height > 0) {
            counterRectangle++;
            if ((width == 1 || height == 1) && (outerSymbol != innerSymbol)) {
                System.out.println("Prostokąt (" + counterRectangle + ") rozmiaru " + width + " x " + height);
                throw new ZProstokatException();
            } else {
                System.out.println("Prostokąt (" + counterRectangle + ") rozmiaru " + width + " x " + height + ", " + innerSymbol + " = " + (width * height - (2 * width + 2 * height) + 4) + ", " + outerSymbol + " = " + (2 * width + 2 * height - 4));
            }
        } else {
            counterSquare++;
            if (height == 0) {
                System.out.println("Kwadrat (" + counterSquare + ") rozmiaru " + width + " x " + width + ", " + innerSymbol + " = " + (width * width - 4 * width + 4) + ", " + outerSymbol + " = " + (4 * width - 4));
            } else {
                System.out.println("Kwadrat (" + counterSquare + ") rozmiaru " + width + " x " + height + ", " + innerSymbol + " = " + (width * height - (2 * width + 2 * height) + 4) + ", " + outerSymbol + " = " + (2 * width + 2 * height - 4));
            }
        }

        height = (height == 0) ? width : height;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print(outerSymbol + " ");
                } else {
                    System.out.print(innerSymbol + " ");
                }
            }
            System.out.println();

        }
        System.out.println();
    }
    public static void main(String[] args) {

        ZProstokat zp[] = {
                new ZProstokat(4, 'a', 'e'),
                new ZProstokat(5, 3 , '*', '+'),
                new ZProstokat(1, 2, 'a','a'),
                new ZProstokat(3, 3, '+', 'x'),
                new ZProstokat(1, 2, 'x', 'y'),
                new ZProstokat(3, 4, '^', '$')
        };

        for (ZProstokat z : zp)
            try {
                z.rysuj();
            } catch(ZProstokatException e) {
                System.out.println(e.getMessage());
            }
    }
}