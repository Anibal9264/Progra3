
package piasystemairline.Presentation.App;
import java.util.logging.Level;
import java.util.logging.Logger;
import piasystemairline.Logic.Avion;
import piasystemairline.Logic.Ciudad;
import piasystemairline.Logic.Escalas;
import piasystemairline.Logic.FormaPago;
import piasystemairline.Logic.ModeloAvion;
import piasystemairline.Logic.Pais;
import piasystemairline.Logic.Persona;
import piasystemairline.Logic.Registro;
import piasystemairline.Logic.Reservacion;
import piasystemairline.Logic.Ruta;
import piasystemairline.Logic.Tiquete;
import piasystemairline.Logic.Vuelo;
import piasystemairline.PIASystemAirline;

public class ControllerApp {
    ModelApp model;
    PiaAPP vista;

    public ControllerApp(ModelApp model, PiaAPP vista) {
       
          this.model = model;
          this.vista = vista;
           vista.setControlador(this);
        try {InicializarBase();} catch (Exception ex) {}
    }
    
   public void EdcionPersonaShow(){
   PIASystemAirline.Controler_Persona.Show();
   }
   public void EdcionAvionShow(){
   PIASystemAirline.Controler_Avion.Show();
   }
   public void EdcionRutaShow(){
   PIASystemAirline.Controler_Ruta.Show();
   }
   public void EdcionHorarioShow(){
   }

    public void OnButtons() {
    vista.PonerTodo();
    }

    public void ChangeNameAndIsAdmin(String name, char admin) {
    vista.UserActivate(name,admin);
    }

    Persona Existe(String user, String pass) throws Exception {
      Persona p = piasystemairline.Logic.Model.instance().ConsultaUser(user);
      if(pass.equals(p.getPass())){
      return p;
      }else{
      return p = new Persona(); 
      }
    }

    void appON() {
     piasystemairline.PIASystemAirline.ControllerAPP.OnButtons();
    }
    
    void SinginShow(){
      Usersingin u = new Usersingin();
      u.setController(this);
      vista.fondo.add(u);
      
    }

    void CargarDatosPersonas(String user) {
    PIASystemAirline.Controler_Persona.CargarPersona(user);
    }
    
    private void InicializarBase() throws Exception{
      piasystemairline.Logic.Model.instance().AgregarPais(new Pais());
      piasystemairline.Logic.Model.instance().AgregarCuidad(new Ciudad());
      piasystemairline.Logic.Model.instance().AgregarEscala(new Escalas());
      piasystemairline.Logic.Model.instance().agregarRuta(new Ruta());
      piasystemairline.Logic.Model.instance().AgregarFormaPago(new FormaPago());
      piasystemairline.Logic.Model.instance().AgregarTiquete(new Tiquete());
      piasystemairline.Logic.Model.instance().AgregarReservacion(new Reservacion());
      piasystemairline.Logic.Model.instance().agregarModeloAvion(new ModeloAvion());
      piasystemairline.Logic.Model.instance().agregarAvion(new Avion());
      piasystemairline.Logic.Model.instance().agregarVuelo(new Vuelo());
      piasystemairline.Logic.Model.instance().agregarRegistro(new Registro());
   }
}
