public abstract class SerVivo {
    protected boolean conVida = true;

    public boolean isConVida() {
        return conVida;
    }

    public void morir() {
        conVida = false;
        System.out.println(" El ser vivo ha muerto.");
    }

    public void revivir() {
        conVida = true;
        System.out.println(" El ser vivo ha revivido.");
    }
}
