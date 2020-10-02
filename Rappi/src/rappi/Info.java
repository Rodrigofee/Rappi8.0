package rappi;

class Info {

    private Estado estado;
    private int next;

    public Info() {
        this.estado = new Pontuacao();
        this.next = 1;
    }

    public void getMenu() {
        this.estado = this.estado.showMenu();
    }

}
