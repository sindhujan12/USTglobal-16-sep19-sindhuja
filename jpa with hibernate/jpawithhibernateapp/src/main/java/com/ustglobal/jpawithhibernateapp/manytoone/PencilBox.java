package com.ustglobal.jpawithhibernateapp.manytoone;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="pencilbox")
public class PencilBox {
	
	@Id
	@Column
	private int bid;
	
	
	@Column
	private String bname;
	@Exclude
	@OneToMany(mappedBy = "pencilbox")
	private List<Pencil> pencil;
	
	
	

}
