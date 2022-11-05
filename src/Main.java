public class Main {
    public class Main2 {
        public static void main(String[] args) {
            int b1=20, c1=50, d1=160, e1=200;
            System.out.println(" Вес на входе "+e1+": ");
            ParamC Vasya = new ParamC("Петя", b1, c1, d1, e1);
            Vasya.c_opti();
            System.out.println(" Вес на выходе : "+e1+" а внутри :"+ Vasya.r_opti());
        }}

    class ParamC {
        String name="Алмазбеков Акылбек агент 007"; // имя
        private int age=40; // возраст
        private int weight=80; // вес
        private int height=180; // рост
        private int opti=height-100+age/2;
        ParamC(String a) {name = a;} //конструктор для 1 параметра
        ParamC(String a,int b) {name = a;age=b;} //конструктор для 2 параметров
        ParamC(String a,int b,int c) {name = a;age=b;weight=c;} //конструктор для 3 параметров
        ParamC(String a,int b,int c,int d) {name = a;age=b;weight=c;height=d;} //конструктор для 4 параметров
        ParamC(String a,int b,int c,int d, int e) {name = a;age=b;weight=c;height=d;opti=e;} // 5 параметров
        // методы
        public String r_Name() {return name;} // возвращает имя
        public int r_age() {return age;} // возвращает возраст
        public int r_weight() {return weight;} // возвращает вес
        public int r_height() {return height;} // возвращает рост
        public int r_opti() {return height-100+age/2;} // возвращает оптимальный вес
        public void c_opti() { // вычисляет оптимальный вес
            opti=height-100+age/2;
            System.out.println(" Посчитала! "+opti+" "+height+" "+weight+" "+age+" "+name);} // вычисляет оптимальный вес
        public void s_name(String n) {name=n;} // изменяет имя
        public void s_age(int a) {age=a;} // изменяет возраст
        public void s_weight(int b) {weight=b;} // изменяет вес
        public void s_height(int c) {height=c;} // изменяет рост
    }
}