package ma.projet.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long nom;

	@ManyToOne
	private Categorie CategorieParent;
	@OneToMany(mappedBy = "CategorieParent", fetch = FetchType.EAGER)
	private List<Categorie> CategoriesParent;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getNom() {
		return nom;
	}

	public void setNom(long nom) {
		this.nom = nom;
	}


	public Categorie getCategorieParent() {
		return CategorieParent;
	}

	public void setCategorieParent(Categorie categorieParent) {
		CategorieParent = categorieParent;
	}

	public List<Categorie> getCategoriesParent() {
		return CategoriesParent;
	}

	public void setCategoriesParent(List<Categorie> categoriesParent) {
		CategoriesParent = categoriesParent;
	}

	public Categorie() {
		super();
	}

}
