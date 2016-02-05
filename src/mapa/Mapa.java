package mapa;

import graficos.Pantalla;
import mapa.cuadro.Cuadro;

public abstract class Mapa {
	protected int ancho;
	protected int alto;
	
	protected int[] cuadros;
	
	public Mapa(int ancho, int alto){
		this.ancho= ancho;
		this.alto= alto;
		
		cuadros= new int[alto *ancho];
		generarMapa();
	}
    public Mapa(String ruta){
    	cargarMapa(ruta);
    }
	
    protected void generarMapa(){
    	
    }
    
    private void cargarMapa(String ruta){
		
	}
    
    public void actualizar(){
    	
    }
    
    public void mostrar(final int compensacionX, final int compensacionY, final Pantalla pantalla){
    	int o = compensacionX >> 5;
    	int e = (compensacionX + pantalla.getAncho() >> 5);
    	int n = compensacionY >> 5;
    	int s=  (compensacionY + pantalla.getAlto() >> 5);
    }
    
    public Cuadro getCuadro(){
    	
    	return null;
    }
}
