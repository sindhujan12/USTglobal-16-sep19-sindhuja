package com.ustglobal.jpawithhibernateapp.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

import lombok.Data;

@Data
@Entity
@Table(name="pencil")
public class Pencil {
	@Id
	@Column
 private int pid;
 
	@Column
private String pcolor;

@ManyToOne(cascade= CascadeType.ALL)
@JoinColumn(name = "bid",nullable=false)
private PencilBox pencilBox;
}
