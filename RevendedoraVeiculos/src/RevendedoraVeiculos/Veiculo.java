
package RevendedoraVeiculos;

public class Veiculo {
    private int codigo;
    private String marca;
    private String modelo;
    private int ano;
    private Double ValorRe;
    private String Placa;
    private Double KmRodado;

    public Veiculo(int codigo, String marca, String modelo, int ano, Double ValorRe, String Placa, Double KmRodado) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ValorRe = ValorRe;
        this.Placa = Placa;
        this.KmRodado = KmRodado;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setValorRe(Double ValorRe) {
        this.ValorRe = ValorRe;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setKmRodado(Double KmRodado) {
        this.KmRodado = KmRodado;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public Double getValorRe() {
        return ValorRe;
    }

    public String getPlaca() {
        return Placa;
    }

    public Double getKmRodado() {
        return KmRodado;
    }

    

    
}
