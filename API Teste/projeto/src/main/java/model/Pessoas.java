package model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "pessoas")
public class Pessoas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")

        private Integer ID;

    @NotNull


    @Column(name = "nome", length = 200, nullable = false)
        private String nome;

    @Column(name = "cpf", length = 11 , nullable = false)
        private String cpf;

    @Column(name = "date", length = 8, nullable = false)
        private String date;
    @Column(name = "email", length = 50 , nullable = false)
        private String email;

        public Integer getId() {
            return ID;
        }

        public void setID(Integer ID) {
            this.ID = ID;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getCpf(){
            return cpf;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getDate() {
            return date;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }
    }


