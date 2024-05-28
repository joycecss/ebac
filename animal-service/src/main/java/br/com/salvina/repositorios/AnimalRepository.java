package br.com.salvina.repositorios;

import br.com.salvina.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada DESC")
    List<Animal> findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL")
    List<Animal> findAdopted();

    @Query("SELECT a.nomeRecebedor, COUNT(a.idAnimal) FROM Animal a WHERE a.dataEntrada BETWEEN :dataInicio AND :dataFinal GROUP BY a.nomeRecebedor")
    List<Object[]> countAnimalsByRecebedor(@Param("dataInicio") Date dataInicio, @Param("dataFinal") Date dataFinal);
}

