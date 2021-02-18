
package FiguraTriangulo;


public class Trinagulo {
    
    public int ResultadoArea; 
    public int ResultadoPerimetro; 
    
    public void perimetroTri (String TrianguloBase){
        int peri= Integer.parseInt(TrianguloBase)*3; this.setResultadoPerimetro(peri);
    }
    
    public void areaTri(String TrianguloBase, String TrianguloAltura){
        int are = Integer.parseInt(TrianguloBase)* Integer.parseInt(TrianguloAltura)/2; this.setResultadoArea(are);
        
        
    }
    
     public int getResultadoArea() {
        return ResultadoArea; 
    }

    public void setResultadoArea(int ResultadoArea) {
        this.ResultadoArea = ResultadoArea;
    }

    public int getResultadoPerimetro() {
        return ResultadoPerimetro;
    }

    public void setResultadoPerimetro(int ResultadoPerimetro) {
        this.ResultadoPerimetro = ResultadoPerimetro;
    }
}
