package piasystemairline.Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import piasystemairline.Logic.Avion;
import piasystemairline.Logic.Ciudad;
import piasystemairline.Logic.Escalas;
import piasystemairline.Logic.ModeloAvion;
import piasystemairline.Logic.Pais;
import piasystemairline.Logic.Persona;
import piasystemairline.Logic.Ruta;
import piasystemairline.Logic.Vuelo;


public class Dao {
    RelDatabase db;
    
    public Dao(){
        db= new RelDatabase();
    }
// -------------------------------AGREGAR--------------------------------------
    
    public void PersonaAdd(Persona p) throws Exception{
        String sql="insert into Usuario (user,pass,name,lastname,email,"
                + "dateBirth,address,workPhone,mobile,Vuelo_id,isAdmin)"
                + " values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')";
        sql=String.format(sql,p.getUser(),p.getPass(),p.getName(),p.getLastName(),
                p.getEmail(),p.getDatebirth(),p.getAddress(),p.getWorkphone(),
                p.getMobile(),p.getVuelo().getId(),p.getIsAdmin());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Persona ya existe");
        }
    }
    
     public void VueloAdd(Vuelo v) throws Exception {
    String sql="insert into Vuelo (id,Ruta_id,VDetalles_id,Avion_id,departureDate,price,returnDate)"+
         "values('%s','%s','%s','%s','%s','%s','%s')";
        sql=String.format(sql,v.getId(),v.getRuta().getId(),v.getVdetalleID(),v.getAvion().getId(),
                v.getRepartureDate(),Integer.toString(v.getPrice()),v.getReturnDate());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Vuelo ya existe");
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
     String sql="insert into Avion (id,age,capacity,numbreRows,seatsPeRrow,"
             + "trademark) values('%s','%s','%s','%s','%s')";
        sql=String.format(sql,a.getId(),Integer.toString(a.getAge()),
                Integer.toString(a.getCapacity()),Integer.toString(a.getNumberRows()),
                Integer.toString(a.getSeatsPeRrow()),a.getTrademark());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Avion ya existe");
        }
    }

    public void RutaAdd(Ruta r) throws Exception {
    String sql="insert into Ruta (id,name,duration,origin_name,destiny_name,Escalas_name)"+
         "values('%s','%s','%s','%s','%s','%s')";
        sql=String.format(sql,r.getId(),r.getName(),r.getDuration(),
                r.getOrigin().getName(),r.getDestiny().getName(),r.getScale().getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Ruta ya existe");
        }
    }
    
    public void EscalaAdd(Escalas e) throws Exception {
    String sql="insert into Ruta (id,Detalle,Ciudad_name)"+
         "values('%s','%s','%s')";
        sql=String.format(sql,e.getId(),e.getDetail(),e.getCity().getName());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Ruta ya existe");
        }
    }
    
    public void CiudadAdd(Ciudad c) throws Exception {
    String sql="insert into Ruta (name,Pais_name)"+
         "values('%s','%s')";
        sql=String.format(sql,c.getName(),c.getPais().getName());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Ciudad ya existe");
        }
    }
    
    public void PaisAdd(Pais p) throws Exception {
    String sql="insert into Ruta (name)"+
         "values('%s')";
        sql=String.format(sql,p.getName());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Pais ya existe");
        }
    }
    
    
    
 //---------------------------UPDATES---------------------------------------   
    
    
    public void PersonaUpdate(Persona p) throws Exception{
        String sql="update Usuario set user='%s',pass='%s',name='%s',"
                + "lastname='%s',email='%s',dateBirth='%s',address='%s',"
                + "workphone='%s',mobile='%s',Vuelo_id='%s'";
        sql=String.format(sql,p.getUser(),p.getName(),p.getLastName(),
                p.getEmail(),p.getDatebirth(),p.getAddress(),p.getWorkphone(),
                p.getMobile(),p.getVuelo().getId());
        
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Persona no existe");
        }
    }
    
    
    public void AvionUpdate(Avion a)throws Exception {
    String sql="update Avion set id='%s',age='%s',model='%s',trademark='%s',"
            + "numberPassengers='%s',numberRows='%s',seatsRows='%s',Ruta_id='%s')";
        sql=String.format(sql,a.getId(),a.getAge(),a.getModel(),
                a.getTrademark(),a.getNumberPassengers(),a.getNumberRows(),
                a.getSeatsPeRrow(),a.getRuta().getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Avion no existe");
        }
    }

    public void RutaUpdate(Ruta r)throws Exception {
    String sql="update Ruta (id='%s',routeName='%s',duration='%s',price='%s',"
            + "arrivalTime='%s',discount='%s',schedule='%s')";
        sql=String.format(sql,r.getId(),r.getName(),r.getDuration(),
         r.getPrice(),r.getArrivalTime(),r.getDiscount(),r.getSchedule());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Ruta no existe");
        }
    }
    
 //--------------------------SHARES--------------------------------------------
    
    public List<Persona>PersonaSearch(String nombre){
        List<Persona> resultado = new ArrayList<Persona>();
        try {
            String sql="select * from "+
                    "Usuario p inner join Vuelo v on p.Vuelo_id=v.id "+
                    "where p.user like '%%%s%%'";
            sql=String.format(sql,nombre);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(persona(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    public List<Vuelo> VueloSearch(String id) {
     List<Vuelo> resultado = new ArrayList<Vuelo>();
        try {
            String sql="select * from "+
                    "Vuelo v inner where v.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(vuelo(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
        
    public List<Avion> AvionSearch(String id) {
      List<Avion> resultado = new ArrayList<Avion>();
        try {
            String sql="select * from "+
                    "Avion a inner join Ruta r on a.Vuelo_id=r.id "+
                    "where a.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(avion(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }

    public List<Ruta> RutaSearch(String id) {
     List<Ruta> resultado = new ArrayList<Ruta>();
        try {
            String sql="select * from "+
                    "Ruta r inner where r.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(ruta(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
   
//--------------------------GETS------------------------------------
   public Persona PersonaGet(String id) throws Exception{
        String sql="select * from "+
                    "Usuario p where p.user like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return persona(rs);
        }
        else{
            throw new Exception ("Persona no Existe");
        }
    }
   
//-------------------------DELATES--------------------------------------   
   
   
   
   
    public void PersonaDelete(Persona p) throws Exception{
        String sql="delete from Usuario where id='%s'";
        sql = String.format(sql,p.getUser());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Persona no existe");
        }
    }



    
//-------------------OTHERS--------------------------------------------
    
    private Persona persona(ResultSet rs){
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
            p.setVuelo(new Vuelo());
//          p.setVuelo(new Vuelo(rs.getString("id"),rs.getString("origin"),
//                    rs.getString("destiny"),rs.getString("date"),
//                    rs.getString("dateBack"),Integer.parseInt(rs.getString("quantity"))));
            return p;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    
    private Vuelo vuelo(ResultSet rs) {
    Vuelo v = new Vuelo();
        try {
            v.setId(rs.getString("id"));
            v.setDate(rs.getString("date"));
            v.setDateBack(rs.getString("dateBack"));
            v.setDestiny(rs.getString("destiny"));
            v.setOrigin(rs.getString("origin"));
            v.setQuantity(Integer.parseInt(rs.getString("quantity")));
           return v;
        } catch (SQLException ex) {
           return null;
        }
    }
    private Avion avion(ResultSet rs) {
    Avion A = new Avion();
        try {
            A.setId(rs.getString("id"));
            A.setAge(Integer.parseInt(rs.getString("age")));
            A.setModel(rs.getString("model"));
            A.setTrademark(rs.getString("trademark"));
            A.setNumberPassengers(Integer.parseInt(rs.getString("numberPassengers")));
            A.setNumberRows(Integer.parseInt(rs.getString("numberRows")));
            A.setSeatsPeRrow(Integer.parseInt(rs.getString("seatsRows")));
            A.setRuta(new Ruta(rs.getString("id"),rs.getString("routeName"),
                    rs.getString("duration"),Integer.parseInt(
                            rs.getString("price")),
                    rs.getString("arrivalTime"),Integer.parseInt(rs.getString("discount")),rs.getString("schedule")));
           return A;
        } catch (SQLException ex) {
           return null;
        }
    }

    private Ruta ruta(ResultSet rs) {
   Ruta r = new Ruta();
        try {
            r.setId(rs.getString("id"));
            r.setName(rs.getString("routeName"));
            r.setDuration(rs.getString("duration"));
            r.setPrice(Integer.parseInt(rs.getString("price")));
            r.setArrivalTime(rs.getString("arrivalTime"));
            r.setDiscount(Integer.parseInt(rs.getString("discount")));
            r.setSchedule(rs.getString("schedule"));
           return r;
        } catch (SQLException ex) {
           return null;
        }
    }

    
     
}
