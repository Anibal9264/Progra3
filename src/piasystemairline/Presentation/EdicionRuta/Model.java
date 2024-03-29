
package piasystemairline.Presentation.EdicionRuta;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import piasystemairline.Logic.Ciudad;
import piasystemairline.Logic.Ruta;


public class Model extends Observable{
    private Ruta ruta;
    private List<Ciudad> Ciudades;
    public Model(Ruta ruta) {
        this.ruta = ruta;
    }

    public Model() {
     ruta = new Ruta();
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
        this.setChanged();
        this.notifyObservers();
    }

    public List<Ciudad> getCiudades() {
        return Ciudades;
    }

    public void setCiudades(List<Ciudad> Ciudades) {
        this.Ciudades = Ciudades;
        this.setChanged();
        this.notifyObservers();
    }
     @Override
    public void addObserver(Observer o){
     super.addObserver(o);
     this.setChanged();
     this.notifyObservers();
    }  
}
