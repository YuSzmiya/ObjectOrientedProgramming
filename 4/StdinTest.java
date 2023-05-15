class StdinTest {
    public static void main(String[] args) {
        Stdin si = new Stdin();

        System.out.print("文字列=");
        String str = si.gets(); // String型(文字列)の入力
        System.out.println(str);

        System.out.print("整数=");
        int no = si.geti(); // int型(整数)の値を入力
        System.out.println(no);

        System.out.print("実数=");
        double po = si.getd(); // double型(実数)の入力
        System.out.println(po);
    }
}
