package piasystemairline.Datos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import piasystemairline.Logic.Avion;
import piasystemairline.Logic.Ciudad;
import piasystemairline.Logic.FormaPago;
import piasystemairline.Logic.ModeloAvion;
import piasystemairline.Logic.Pais;
import piasystemairline.Logic.Persona;
import piasystemairline.Logic.Tiquete;
import piasystemairline.Logic.Reservacion;
import piasystemairline.Logic.Ruta;
import piasystemairline.Logic.Seat;
import piasystemairline.Logic.Vuelo;


public class Dao {
    RelDatabase db;
    public Dao(){
        db= new RelDatabase();
       
    }
// -------------------------------AGREGAR--------------------------------------
    
    public void PersonaAdd(Persona p) throws Exception{
        String sql="insert into Usuario (user,pass,name,lastname,email,"
                + "dateBirth,address,workPhone,mobile,isAdmin)"
                + " values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')";
        sql=String.format(sql,p.getUser(),p.getPass(),p.getName(),p.getLastName(),
                p.getEmail(),p.getDatebirth(),p.getAddress(),p.getWorkphone(),
                p.getMobile(),p.getIsAdmin());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Persona ya existe");
        }
    }
    
     public void VueloAdd(Vuelo v) throws Exception {
    String sql="insert into Vuelo (id,Ruta_id,Avion_id,Time,Day)"+
         "values('%s','%s','%s','%s','%s')";
        sql=String.format(sql,v.getId(),v.getRuta().getId(),v.getAvion().getId(),
                v.getTime(),v.getDay());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Vuelo ya existe");
        }
    }
    public void AsientoAdd(Seat s) throws Exception {
    String sql="insert into Seat (numero,Vuelo_id)"+
         "values('%s','%s')";
        sql=String.format(sql,s.getNumero(),s.getId_vuelo());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Asiento ya existe");
        }
    }
    public void AvionAdd(Avion a)throws Exception {
     String sql="insert into Avion (id,ModeloAvion_id) values('%s','%s')";
        sql=String.format(sql,a.getId(),a.getM_Avion().getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Avion ya existe");
        }
    }
   
    public void ModeloAvionAdd(ModeloAvion a)throws Exception {
     String sql="insert into ModeloAvion (id,age,capacity,numberRows,seatsPeRrow,"
             + "trademark) values('%s','%s','%s','%s','%s','%s')";
        sql=String.format(sql,a.getId(),Integer.toString(a.getAge()),
                Integer.toString(a.getCapacity()),Integer.toString(a.getNumberRows()),
                Integer.toString(a.getSeatsPeRrow()),a.getTrademark());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Avion ya existe");
        }
    }

    public void RutaAdd(Ruta r) throws Exception {
    String sql="insert into Ruta (id,name,duration,price,discount,origin_id,destiny_id,escale_id)"+
         "values('%s','%s','%s','%s','%s','%s','%s','%s')";
        sql=String.format(sql,r.getId(),r.getName(),r.getDuration(),String.valueOf(r.getPrice()),String.valueOf(r.getDiscount()),
                r.getOrigin().getId(),r.getDestiny().getId(),r.getScale().getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Ruta ya existe");
        }
    }

    public void CiudadAdd(Ciudad c) throws Exception {
    String sql="insert into Ciudad (id,name,Pais_id) "+
         "values('%s','%s','%s')";
        sql=String.format(sql,c.getId(),c.getName(),c.getPais().getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Ciudad ya existe");
        }
    }
    
    public void PaisAdd(Pais p) throws Exception {
    String sql="insert into Pais (id,name) "+
         "values('%s','%s')";
        sql=String.format(sql,p.getId(),p.getName());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Pais ya existe");
        }
    }
    
    public void ReservacionAdd(Reservacion r) throws Exception {
    String sql="insert into Reservacion (id,Date,FormaPago_id,Usuario_user,Tiquete_id) "
            + "values('%s','%s','%s','%s','%s')";
        sql=String.format(sql,r.getId(),r.getDate(),r.getFpago().getId(),
                r.getPersona().getUser(),r.getTiqueteID());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Reservacion ya existe");
        }
    }    
    public void FormaPagoAdd(FormaPago f) throws Exception {
    String sql="insert into FormaPago (id,data) "
            + "values('%s','%s')";
        sql=String.format(sql,f.getId(),f.getData());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("FormaPago ya existe");
        }
    }
    
   public void TiqueteAdd(Tiquete r) throws Exception {
    String sql="insert into Tiquete (id,price,departureDate,returnDate,Reservacion_id,Vuelo_id) "
            + "values('%s','%s','%s','%s','%s','%s')";
        sql=String.format(sql,r.getId(),r.getPrice(),r.getDepartureDate(),
                r.getReturnDate(),r.getReservacion().getId(),r.getVuelo().getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Viaje ya existe");
        }
    }
    
    
 //---------------------------UPDATES--------------------------------------- //////////////////////////////////////////////////////////////  
    
    
    public void PersonaUpdate(Persona p) throws Exception{
      String sql="update Usuario set pass='%s',name='%s'"
              + ",lastname='%s',email='%s',dateBirth='%s',address='%s',"
              + "workPhone='%s',mobile='%s',isAdmin='%s' where user='%s'";
        sql=String.format(sql,p.getPass(),p.getName(),p.getLastName(),
                p.getEmail(),p.getDatebirth(),p.getAddress(),p.getWorkphone(),
                p.getMobile(),p.getIsAdmin(),p.getUser());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Persona no existe");
        }
    }
    public void ModeloAvionUpdate(ModeloAvion m) throws Exception {
       String sql="update ModeloAvion set age='%s',capacity='%s',"
               + "numberRows='%s',seatsPeRrow='%s',trademark='%s'"
               + " where id='%s'";
        sql=String.format(sql,Integer.toString(m.getAge()),
                Integer.toString(m.getCapacity()),Integer.toString(m.getNumberRows()),
                Integer.toString(m.getSeatsPeRrow()),m.getTrademark(),m.getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("ModeloAvion no existe");
        }
    }
    
    public void AvionUpdate(Avion a) throws Exception {
    String sql="update Avion set ModeloAvion_id='%s' where id='%s' ";
        sql=String.format(sql,a.getM_Avion().getId(),a.getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Avion no existe");
        }
    }
    
    public void CiudadUpdate(Ciudad c) throws Exception {
    String sql="update Ciudad set Pais_name='%s',name='%s' where id='%s' ";
        sql=String.format(sql,c.getPais().getName(),c.getName(),c.getName());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Ciudad no existe");
        }
    }

    public void PaisUpdate(Pais p) throws Exception {
    String sql="update Pais set name='%s' where id='%s'";
        sql=String.format(sql,p.getName(),p.getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Pais no existe");
        }
    }
     public void VueloUpdate(Vuelo v) throws Exception {
      String sql="update Vuelo set Ruta_id='%s',Avion_id='%s',Time='%s',Day='%s' where id='%s' ";
         sql=String.format(sql,v.getRuta().getId(),v.getAvion().getId(),
                v.getTime(),v.getDay(),v.getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Vuelo no existe");
        }
     }

    

    public void RutaUpdate(Ruta r) throws Exception {
    String sql="update Ruta set name='%s',duration='%s',origin_id='%s',"
            + "destiny_id='%s',escale_id='%s',price='%s',discount'%s' where id='%s'";
        sql=String.format(sql,r.getName(),r.getDuration(),
                r.getOrigin().getId(),r.getDestiny().getId(),
                r.getScale().getId(),String.valueOf(r.getPrice()),String.valueOf(r.getDiscount()),r.getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Ruta no existe");
        }
    }

    public void ReservacionUpdate(Reservacion r) throws Exception {
    String sql="update Reservacion set FormaPago_id='%s',Date='%s',Tiquete_id='%s' where id='%s'";
        sql=String.format(sql,r.getFpago().getId(),r.getDate(),r.getTiqueteID(),r.getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Reservacion no existe");
        }
    }
    public void FormaPagoUpdate(FormaPago f) throws Exception {
    String sql="update FormaPago set data='%s' where id='%s' ";
        sql=String.format(sql,f.getData(),f.getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("FormaPago no existe");
        }
    }    
 //--------------------------SEARCHES--------------------------------------------
      
    
   
    public List<Persona>PersonaSearch(String nombre) throws Exception{
        List<Persona> resultado = new ArrayList<Persona>();
        try {
            String sql="select * from "+
                    "Usuario p "+
                    "where p.user like '%%%s%%'";
            sql=String.format(sql,nombre);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(persona(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    public List<ModeloAvion>ModeloAvionSearch(String id){
        List<ModeloAvion> resultado = new ArrayList<ModeloAvion>();
        try {
            String sql="select * from "+
                    "ModeloAvion m where m.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(modeloAvion(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    public List<Avion> AvionSearch(String id) throws Exception {
      List<Avion> resultado = new ArrayList<Avion>();
        try {
            String sql="select * from "+
                    "Avion a inner join ModeloAvion m on a.ModeloAvion_id=m.id "+
                    "where a.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(avion(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    public List<Pais> PaisSearch(String id) throws Exception {
     List<Pais> resultado = new ArrayList<Pais>();
        try {
             String sql="select * from "+
                    "Pais p where p.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(pais(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    public List<Ciudad> CiudadSearch(String id) throws Exception {
      List<Ciudad> resultado = new ArrayList<Ciudad>();
        try {
            String sql="select * from "+
                    "Ciudad c inner join Pais p on c.Pais_id=p.id "+
                    "where c.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(ciudad(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    public List<Ruta> RutaSearch(String id) throws Exception {
     List<Ruta> resultado = new ArrayList<Ruta>();
        try {
           String sql="select * from Ruta r inner join Ciudad c on r.origin_id=c.id"
                + " join Ciudad c2 on r.destiny_id=c2.id join Ciudad c3 on "
                + "r.escale_id=c3.id where r.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(ruta(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    
     public List<Ruta> RutaDescuentoSearch() throws Exception {
     List<Ruta> resultado = new ArrayList<Ruta>();
        try {
           String sql="select * from Ruta r inner join Ciudad c on r.origin_id=c.id"
                + " join Ciudad c2 on r.destiny_id=c2.id join Ciudad c3 on "
                + "r.escale_id=c3.id where r.discount != '0'";
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(ruta(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    
    public List<FormaPago> FormaPagoSearch(String id) {
     List<FormaPago> resultado = new ArrayList<FormaPago>();
        try {
            String sql="select * from "+
                    "FormaPago f where f.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(formaPago(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
     public List<Reservacion> ReservacionSearch(String id) throws Exception {
      List<Reservacion> resultado = new ArrayList<Reservacion>();
        try {
            String sql="select * from "+
                    "Reservacion r inner join FormaPago f "
                    +"on r.FormaPago_id=f.id "+
                    "where r.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(reservacion(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
     
    public List<Reservacion> ListaReservaPersonaSearch(Persona p) throws Exception {
     List<Reservacion> resultado = new ArrayList<Reservacion>();
        try {
            String sql="select * from "+
                    "Reservacion r inner join FormaPago f "
                    +"on r.FormaPago_id=f.id "+
                    "where r.Usuario_user like '%%%s%%'";
            sql=String.format(sql,p.getUser());
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(reservacion(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
     
     
    public List<Tiquete> TiquetesSearch(String id) throws Exception {
     List<Tiquete> resultado = new ArrayList<Tiquete>();
        try {
            String sql="select * from "+
                    "Tiquete v inner join Reservacion r on v.Reservacion_id=r.id "
                    + "join Vuelo vu on v.Vuelo_id=vu.id "
                    +"where v.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(Tiquete(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    } 
    
    public List<Vuelo> VueloSearch(String id) throws Exception {
     List<Vuelo> resultado = new ArrayList<Vuelo>();
        try {
            String sql="select * from Vuelo v inner join Ruta ru on "
          + "v.Ruta_id=ru.id join Avion a on v.Avion_id=a.id "
          +"where v.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(vuelo(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    } 
    
     public List<Seat> SeatSearch(String id) throws Exception {
     List<Seat> resultado = new ArrayList<Seat>();
        try {
            String sql="select * from Seat s "
          +"where s.Vuelo_id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(seat(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    } 
    
    public List<Vuelo> FindVueloList(Vuelo filtro) throws Exception {
     List<Vuelo> resultado = new ArrayList<Vuelo>();
     String a ="";
        try {
            String sql="select * from Vuelo v inner join Ruta ru  on v.Ruta_id=ru.id " +
            "where v.id like '%%%s%%' and origin_id like '%s' and destiny_id like '%s' " +
            "and Day like '%s'";
            sql=String.format(sql,a,filtro.getRuta().getOrigin().getId(),
                    filtro.getRuta().getDestiny().getId(),filtro.getDay());
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(Fvuelo(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    } 
    
//  FACTURACION POR MESES (12 MESES)
    public List<Tiquete> ListaFacturacionPorMes(String mes) throws Exception {
     List<Tiquete> resultado = new ArrayList<Tiquete>();
        try {
            String sql="select * from "
                    +"tiquete t inner join reservacion r "
                    +"on t.reservacion_id=r.id "
                    +"where r.date like '2019-"+mes+"-%% %%:%%:%%'";
            sql=String.format(sql,mes);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(Tiquete(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    
    //FACTURACION POR ANNO (ANNO ACTUAL)
    public List<Tiquete> ListaFacturacionPorAnno(String anno) throws Exception {
     List<Tiquete> resultado = new ArrayList<Tiquete>();
        try {
            String sql="select * from "
                    +"tiquete t inner join reservacion r "
                    +"on t.reservacion_id=r.id "
                    +"where r.date like '"+anno+"-%%-%% %%:%%:%%'";
            sql=String.format(sql,anno);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(Tiquete(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    
     
//  LISTADO DE CLIENTES POR AVION
     public List<Persona> ListadoClientesPorAvion(String avion) throws Exception {
     List<Persona> resultado = new ArrayList<Persona>();
        try {
            String sql="select * from "+
                    "usuario u inner join reservacion r "
                    +"on u.user = r.usuario_user "
                    +"inner join tiquete t "
                    +"on t.reservacion_id = t.id "
                    +"inner join vuelo v "
                    +"on t.vuelo_id = v.id "
                    +"where v.avion_id like '"+avion+"'";
            sql=String.format(sql,avion);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(persona(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
     
//  LAS 5 RUTAS MAS VENDIDAS O RESERVADAS
public List<Reservacion> ListadoRutasMasVendidas(Tiquete t) throws Exception {
     List<Reservacion> resultado = new ArrayList<Reservacion>();
        try {
            String sql="select * from "
                    +"tiquete t inner join reservacion r "
                    +"on t.resercicion_id=r.id "
                    +"where r.date like '%%-%%-%% %%:%%:%%'";
            sql=String.format(sql,t.getPrice());
//format(sql,/*p.getUser()*/);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(reservacion(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }     
    
      
   
//--------------------------GETS------------------------------------
   public Persona PersonaGet(String id) throws Exception{
        String sql="select * from "+
                    "Usuario p "+
                    "where p.User like '%%%s%%' ";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return persona(rs);
        }
        else{
            throw new Exception ("Persona no Existe");
        }
    }
   
   
    public ModeloAvion ModeloAvionGet(String id) throws Exception {
       String sql="select * from "+
                    "ModeloAvion m where m.id like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return modeloAvion(rs);
        }
        else{
            throw new Exception ("Persona no Existe");
        }
    }
   public Avion AvionGet(String id) throws Exception {
        String sql="select * from "+
                    "Avion a inner join ModeloAvion m on a.ModeloAvion_id=m.id "+
                    "where a.id like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return avion(rs);
        }
        else{
            throw new Exception ("Avion no Existe");
        }
    }    
     public Pais PaisGet(String id) throws Exception {
       String sql="select * from "+
                    "Pais p where p.id like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return pais(rs);
        }
        else{
            throw new Exception ("Pais no Existe");
        }
    }
   public Ciudad CiudadGet(String id) throws Exception {
     String sql="select * from "+
                    "Ciudad c inner join Pais p on c.Pais_id=p.id "+
                    "where c.id like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return ciudad(rs);
        }
        else{
            throw new Exception ("Ciudad no Existe");
        }
    }

     public Ruta RutaGet(String id) throws Exception {
        String sql="select * from Ruta r inner join Ciudad c on r.origin_id=c.id"
                + " join Ciudad c2 on r.destiny_id=c2.id join Ciudad c3 on "
                + "r.escale_id=c3.id where r.id like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return ruta(rs);
        }
        else{
            throw new Exception ("Ruta no Existe");
        }
    }  
    public FormaPago FormaPagoGet(String id) throws Exception {
       String sql="select * from "+
                    "FormaPago f where f.id like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return formaPago(rs);
        }
        else{
            throw new Exception ("FormaPago no Existe");
        }
    }    
    public Reservacion ReservacionGet(String id) throws Exception {
       String sql="select * from "+
                    "Reservacion r inner join FormaPago f "
                    +"on r.FormaPago_id=f.id "+
                    "where r.id like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return reservacion(rs);
        }
        else{
            throw new Exception ("Reservacion no Existe");
        }
    }
   
    public Vuelo VueloGet(String id) throws Exception {
      String sql="select * from Vuelo v inner join Ruta ru on v.Ruta_id=ru.id"
              + " join Avion a on v.Avion_id=a.id where v.id like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return vuelo(rs);
        }
        else{
            throw new Exception ("Vuelo no Existe");
        }
    }

    public Tiquete TiqueteGet(String id) throws Exception {
     String sql="select * from Tiquete v inner join Reservacion r "
             + "on v.Reservacion_id=r.id join Vuelo vu  on v.Vuelo_id=vu.id "
             + "where v.id like  '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            if (rs.next()) {
                return Tiquete(rs);
            }else{
              throw new Exception ("Viaje no Existe");
            }
    }
    
//-------------------------REPORTS--------------------------------------
   

    
    
    
//-------------------------DELATES--------------------------------------   
   
   
   
   
    public void PersonaDelete(Persona p) throws Exception{
        String sql="delete from Usuario where id='%s'";
        sql = String.format(sql,p.getUser());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Persona no existe");
        }
    }

    public void EliminarModeloAvion(String id) throws Exception {
        String sql="delete from ModeloAvion where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("ModeloAvion no existe");
        }
    }
    public void EliminarAvion(String id) throws Exception {
        String sql="delete from Avion where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Avion no existe");
        }
    }
    public void EliminarPais(String id) throws Exception {
        String sql="delete from Pais where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Pais no existe");
        }
    }
    public void EliminarCiudad(String id) throws Exception {
        String sql="delete from Ciudad where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Ciudad no existe");
        }
    }
    public void EliminarEscala(String id) throws Exception {
        String sql="delete from Escalas where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Escala no existe");
        }
    }
    public void EliminarRuta(String id) throws Exception {
        String sql="delete from Ruta where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Ruta no existe");
        }
    }
    public void EliminarFormaPago(String id) throws Exception {
        String sql="delete from FormaPago where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("FormaPago no existe");
        }
    }
    public void EliminarReservacion(String id) throws Exception {
        String sql="delete from Reservacion where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Reservacion no existe");
        }
    }
    
    public void EliminarVuelo(String id) throws Exception {
        String sql="delete from Vuelo where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Vuelo no existe");
        }
    }
    
    public void EliminarRegistro(String id) throws Exception {
        String sql="delete from Registro where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Registro no existe");
        }
    }
    
//-------------------OTHERS--------------------------------------------
    
    private Persona persona(ResultSet rs) throws Exception{
        try {
            Persona p=new Persona();
            p.setUser(rs.getString("user"));
            p.setPass(rs.getString("pass"));
            p.setName(rs.getString("name"));
            p.setLastName(rs.getString("lastName"));
            p.setDatebirth(rs.getString("datebirth"));
            p.setEmail(rs.getString("email"));
            p.setWorkphone(rs.getString("workPhone"));
            p.setAddress(rs.getString("address"));
            p.setMobile(rs.getString("mobile"));
            p.setIsAdmin(rs.getString("isAdmin").charAt(0));
            return p;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    
     private ModeloAvion modeloAvion(ResultSet rs) {
      ModeloAvion m = new ModeloAvion();
        try {
            m.setId(rs.getString("id"));
            m.setAge(Integer.parseInt(rs.getString("age")));
            m.setCapacity(Integer.parseInt(rs.getString("capacity")));
            m.setNumberRows(Integer.parseInt(rs.getString("numberRows")));
            m.setSeatsPeRrow(Integer.parseInt(rs.getString("seatsPeRrow")));
            m.setTrademark(rs.getString("trademark"));
            return m;
        } catch (SQLException ex) {
          return null;
        }
     }
     private Avion avion(ResultSet rs) throws Exception{
     Avion a = new Avion();
     try {
         a.setId(rs.getString("id"));
         a.setM_Avion(ModeloAvionGet(rs.getString("ModeloAvion_id")));
         return a;
     } catch (SQLException ex) {
         return null;
     }
     }
     
    private Pais pais(ResultSet rs) {
    Pais p = new Pais();
     try {
         p.setId(rs.getString("id"));
         p.setName(rs.getString("name"));
         return p;
     } catch (SQLException ex) {
         return null;
     }
    }

    private Ciudad ciudad(ResultSet rs) throws Exception {
      Ciudad c = new Ciudad();
     try {
         c.setId(rs.getString("id"));
         c.setName(rs.getString("name"));
         c.setPais(PaisGet(rs.getString("Pais_id")));
         return c;
     } catch (SQLException ex) {
         return null;
     }
    }

    private Ruta ruta(ResultSet rs) throws Exception {
        Ruta r = new Ruta();
    try {
         r.setId(rs.getString("id"));
         r.setName(rs.getString("name"));
         r.setPrice(Integer.parseInt(rs.getString("price")));
         r.setDiscount(Integer.parseInt(rs.getString("discount")));
         r.setDuration(rs.getString("duration"));
         r.setOrigin(CiudadGet(rs.getString("origin_id")));
         r.setDestiny(CiudadGet(rs.getString("destiny_id")));
         r.setScale(CiudadGet(rs.getString("escale_id")));
         return r;
     } catch (SQLException ex) {
         return null;
     }
    }
    
    private FormaPago formaPago(ResultSet rs) {
    FormaPago f = new FormaPago();
     try {
         f.setId(rs.getString("id"));
         f.setData(rs.getString("data"));
         return f;
     } catch (SQLException ex) {
         return null;
     }
    }
    private Reservacion reservacion(ResultSet rs) throws Exception {
    Reservacion r = new Reservacion();
     try {
         r.setId(rs.getString("id"));
         r.setDate(rs.getString("Date"));
         r.setFpago(FormaPagoGet(rs.getString("FormaPago_id")));
         r.setTiqueteID(rs.getString("Tiquete_id"));
         return r;
     } catch (SQLException ex) {
         return null;
     }
    }

    private Vuelo vuelo(ResultSet rs) throws Exception {
        Vuelo v = new Vuelo(); 
        try {
         v.setId(rs.getString("id"));
         v.setAvion(AvionGet(rs.getString("Avion_id")));
         v.setRuta(RutaGet(rs.getString("Ruta_id")));
         v.setTime(rs.getString("Time"));
         v.setDay(rs.getString("Day"));
         return v;
     } catch (SQLException ex) {
         return null;
     }
    }
    
    private Vuelo Fvuelo(ResultSet rs) throws Exception {
        Vuelo v = new Vuelo(); 
        try {
         v.setId(rs.getString("id"));
         v.setAvion(AvionGet(rs.getString("Avion_id")));
         v.setRuta(RutaGet(rs.getString("Ruta_id")));
         v.getRuta().setOrigin(CiudadGet(rs.getString("origin_id")));
         v.getRuta().setDestiny(CiudadGet(rs.getString("destiny_id")));
         v.setTime(rs.getString("Time"));
         v.setDay(rs.getString("Day"));
         return v;
     } catch (SQLException ex) {
         return null;
     }
    }
    
    private Tiquete Tiquete(ResultSet rs) throws Exception {
    Tiquete r = new Tiquete();
     try {
         r.setId(rs.getString("id"));
         r.setPrice(Integer.parseInt(rs.getString("price")));
         r.setDepartureDate(rs.getString("departureDate"));
         r.setReturnDate(rs.getString("returnDate"));
         r.setReservacion(ReservacionGet(rs.getString("Reservacion_id")));
         r.setVuelo(VueloGet(rs.getString("Vuelo_id")));
         return r;
     } catch (SQLException ex) {
         return null;
     }
    }   

    private Seat seat(ResultSet rs) {
    Seat s = new Seat();
     try {
         s.setId_vuelo(rs.getString("Vuelo_id"));
         s.setNumero(Integer.parseInt(rs.getString("numero")));
         return s;
     } catch (SQLException ex) {
         return null;
     }
    }

   

    
}
