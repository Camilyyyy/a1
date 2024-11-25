public class logicas {
    private List<Deportista> lista;

    public logicas() {// Constructor con datos quemados para que al iniciar automaticamente venga por defecto lo que uno quiera
        //Peroo siempre el lista.add debe ir debajo de la definicion de la lista es decir debajo del =new lo que sea
        lista=new ArrayList<Deportista>;
        lista.add(new Deportista(1,"Camily","f","ATLETISMO",3,21));
        lista.add(new Deportista(2,"Camily","f","ATLETISMO",3,21));
        lista.add(new Deportista(3,"Camily","f","ATLETISMO",3,21));
        lista.add(new Deportista(4,"Camily","f","ATLETISMO",3,21));
        lista.add(new Deportista(5,"Camily","f","ATLETISMO",3,21));
        lista.add(new Deportista(6,"Camily","f","ATLETISMO",3,21));
        lista.add(new Deportista(7,"Camily","f","ATLETISMO",3,21));
        lista.add(new Deportista(8,"Camily","f","ATLETISMO",3,21));
        lista.add(new Deportista(9,"Camily","f","ATLETISMO",3,21));
        lista.add(new Deportista(10,"Camily","f","ATLETISMO",3,21));

    }

    public List<Deportista> getLista() {
        return lista;
    }

    public void setLista(List<Deportista> lista) {
        this.lista = lista;
    }

    public void incendiooo(){//a este metodo lo llamas desde ventana al aplastar un boton
        lista.add(new Deportista(1,"Camily","f","ATLETISMO",3,21));
        lista.add(new Deportista(2,"Camily","f","ATLETISMO",3,21));
        lista.add(new Deportista(3,"Camily","f","ATLETISMO",3,21));
        lista.add(new Deportista(4,"Camily","f","ATLETISMO",3,21));
        lista.add(new Deportista(5,"Camily","f","ATLETISMO",3,21));
        lista.add(new Deportista(6,"Camily","f","ATLETISMO",3,21));
        lista.add(new Deportista(7,"Camily","f","ATLETISMO",3,21));
        lista.add(new Deportista(8,"Camily","f","ATLETISMO",3,21));
        lista.add(new Deportista(9,"Camily","f","ATLETISMO",3,21));
        lista.add(new Deportista(10,"Camily","f","ATLETISMO",3,21));
    }
    public String infolist(){
        String info="";
        StringBuilder sb=new StringBuilder();
        for (Deportista aux: lista){
            info=sb.append(aux.toString());
        }
        return info;
    }

    public void Buscar(int id,int ren){
        for(Deportista a: lista){
            if (a.getId().equalsTo(id)){
                a.setRendimiento(ren);
                JoptionPane.showMessageDialog("felicid");
            }

        }
        JoptionPane.showMessageDialog("triste");

    }

}
