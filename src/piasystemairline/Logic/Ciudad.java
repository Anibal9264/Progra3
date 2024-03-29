
package piasystemairline.Logic;

import java.util.Objects;

public class Ciudad {
  private String id;
  private String name;
  private Pais pais;

    public Ciudad() {
        this.id = "node";
        this.name = "null";
        this.pais = new Pais();
    }

    public Ciudad(String id, String name, Pais pais) {
        this.id = id;
        this.name = name;
        this.pais = pais;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
         if(!id.equalsIgnoreCase("none")){
           return name+"/"+ pais.getName();
       }else{
           return "";
       }
       
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ciudad other = (Ciudad) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
  
  
}
