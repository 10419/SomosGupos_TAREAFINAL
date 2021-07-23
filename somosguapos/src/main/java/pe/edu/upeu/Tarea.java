package pe.edu.upeu;

public class Tarea{

   
    public void Cadenitas(String[][] matriz){
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j]!=null && !matriz[i][j].equals("")){
                    System.out.print(matriz[i][j]+"\t");  
                }else{
                    System.out.print("\t");
                }   
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void transformada1(int dim, int valini){
        System.out.println("Ejer 1");
        String[][] matriz = new String[dim][dim];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0 ; j <= i; j++) {
                matriz[i][(dim-1)-j]=" "+valini;
                valini++;
            }
        }
        Cadenitas(matriz);
    }
    public void transformada2(int dim, int valini){
        System.out.println("Ejer 2 ");
        String[][] matriz = new String[dim][dim];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0 ; j <= i; j++) {
                matriz[i][j]=" "+valini;
                valini++;
            }
        }
        Cadenitas(matriz);
    }
    public void transformada3(int dim, int valini){
        System.out.println("Ejer3 ");
        String[][] matriz = new String[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0 ; j < (dim-i); j++) {
                matriz[i][j]=" "+valini;
                valini++;
            }
        }
        Cadenitas(matriz);
    }
    public void transformada4(int dim, int valini){
        System.out.println("Ejer 4");
        String[][] matriz = new String[dim][dim];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= (dim-1)-i ; j++) {
                matriz[i][(j+i)]=" "+valini;
                valini++;
            }
        }
        Cadenitas(matriz);
    }
    public void transformada5(int dim, int valini){
        System.out.println("Ejer 5");
        String[][] matriz = new String[dim][dim];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0 ; j <= i; j++) {
                matriz[i][((dim-1)-i)+j]=" "+valini;
                valini++;
            }
        }
        Cadenitas(matriz);
    }
    public void transformada6(int dim, int valini){
        System.out.println("Ejer 6");
        String[][] matriz = new String[dim][dim];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0 ; j <= i; j++) {
                matriz[i][(i)-j]=" "+valini;
                valini++;
            }
        }
        Cadenitas(matriz);
    }
    public void transformada7(int dim, int valini){
        System.out.println("Ejer 7 ");
        String[][] matriz = new String[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0 ; j < (dim-i); j++) {
                matriz[i][((dim-1)-i)-j]=" "+valini;
                valini++;
            }
        }
        Cadenitas(matriz);
    }
    public void transformada8(int dim, int valini) {
        System.out.println("Ejer 8");
        String[][] matriz=new String[dim][dim];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= (dim-1)-i; j++) {
                matriz[i][(dim-1)-j]=""+valini;
                valini++;
            }
        }  
        Cadenitas(matriz);
    }
    public void transformada9(int dim, int valini) {
        System.out.println("Ejer 9");
        String[][] matriz=new String[dim][dim];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i <= (dim-1)-j; i++) {
                matriz[i][j]=""+valini;
                valini++;
            }
        }
        Cadenitas(matriz);
    }
    public void transformada10(int dim, int valini){
        System.out.println("Ejer 10");
        String[][] matriz = new String[dim][dim];
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0 ; i <= j; i++) {
                matriz[i][j]=" "+valini;
                valini++;
            }
        }
        Cadenitas(matriz);
    } 
    public void transformada11(int dim, int valini){
        System.out.println("Ejer 11");
        String[][] matriz = new String[dim][dim];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < dim - j; i++) {
                matriz[(dim-1)-i][j]=""+valini;
                valini++;
            }
        }
        Cadenitas(matriz);
    }
    public void transformada12(int dim, int valini){
        System.out.println("Ejer 12");
        String[][] matriz = new String[dim][dim];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i <= j; i++) {
                matriz[(dim-1)-i][j]=""+valini;
                valini++;
            }
        }
        Cadenitas(matriz);
    }
    public void transformada13(int dim, int valini) {
        System.out.println("Ejer 13 ");
        String[][] matriz=new String[dim][dim];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i <= (dim-1)-j; i++) {
                matriz[i][(dim-1)-j]=""+valini;
                valini++;
            }
        }
        Cadenitas(matriz);
    }
    public void transformada14(int dim, int numini) {
        System.out.println("Ejer 14 ");
        String[][] matriz=new String[dim][dim];
        for (int j = matriz[0].length-1; j >=0; j--) {
            for (int i = 0; i < (matriz.length)-j; i++) {            
                matriz[i][j]=""+numini;
                numini++;
            }
        }
        Cadenitas(matriz);
    }
    public void transformada15(int dim, int valini){
        System.out.println("Ejer 15");
        String[][] matriz = new String[dim][dim];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < dim - j; i++) {
                matriz[(dim-1)-i][(dim-1)-j]=""+valini;
                valini++;
            }
        }
        Cadenitas(matriz);
    }
    public void transformada16(int dim, int valini){
        System.out.println("Ejer 16");
        String[][] matriz = new String[dim][dim];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i <= j; i++) {
                matriz[(dim-1)-i][(dim-1)-j]=""+valini;
                valini++;
            }
        }
        Cadenitas(matriz);
    }
    public void transformada17(int dim, int valini) {
        System.out.println("Ejer 17");
        String[][] matriz=new String[dim][dim];
        for (int j = 0; j < matriz[0].length; j++) {
            if(j%2==0){
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+valini;
                    valini++;
                }
            }else{
                for (int i =  matriz.length-1; i >=0; i--) {
                    matriz[i][j]=""+valini;
                    valini++;
                }
            }
        }
        Cadenitas(matriz);
    } 
    public void transformada18(int dim, int valini) {
        System.out.println("Ejer 18");
        String[][] matriz=new String[dim][dim];
        for (int j = matriz[0].length-1; j>=0 ; j--) {
            if(j%2==0){
                for (int i =  matriz.length-1; i >=0; i--) {
                    matriz[i][j]=""+valini;
                    valini++;
                }                
            }else{
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+valini;
                    valini++;
                }
            }
        }
        Cadenitas(matriz);
    }
    public void transformada19(int dimen, int numInit) {
        System.out.println("Ejer 19");
        String[][] matriz=new String[dimen][dimen];//j=filas, i=columnas
        for (int j = matriz.length-1; j >=0; j--) {
            if(j%2==0){
                for (int i = 0; i < (matriz[0].length); i++) {            
                    matriz[j][i]=""+numInit;
                    numInit++;
                }
            }else{
                for (int i = matriz[0].length-1; i >=0 ; i--) {            
                    matriz[j][i]=""+numInit;
                    numInit++;
                }
            }
        }
        Cadenitas(matriz);
    }
}