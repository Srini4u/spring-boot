/**
 * This class is generated by jOOQ
 */
package sample.jooq.domain.tables.records;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import sample.jooq.domain.tables.Author;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org",
		"jOOQ version:3.6.2" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorRecord extends UpdatableRecordImpl<AuthorRecord>
		implements Record6<Integer, String, String, Date, Integer, Byte> {

	private static final long serialVersionUID = -983051550;

	/**
	 * Setter for <code>PUBLIC.AUTHOR.ID</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.AUTHOR.ID</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.AUTHOR.FIRST_NAME</code>.
	 */
	public void setFirstName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.AUTHOR.FIRST_NAME</code>.
	 */
	public String getFirstName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.AUTHOR.LAST_NAME</code>.
	 */
	public void setLastName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.AUTHOR.LAST_NAME</code>.
	 */
	public String getLastName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.AUTHOR.DATE_OF_BIRTH</code>.
	 */
	public void setDateOfBirth(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>PUBLIC.AUTHOR.DATE_OF_BIRTH</code>.
	 */
	public Date getDateOfBirth() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>PUBLIC.AUTHOR.YEAR_OF_BIRTH</code>.
	 */
	public void setYearOfBirth(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>PUBLIC.AUTHOR.YEAR_OF_BIRTH</code>.
	 */
	public Integer getYearOfBirth() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>PUBLIC.AUTHOR.DISTINGUISHED</code>.
	 */
	public void setDistinguished(Byte value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>PUBLIC.AUTHOR.DISTINGUISHED</code>.
	 */
	public Byte getDistinguished() {
		return (Byte) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, Date, Integer, Byte> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, Date, Integer, Byte> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Author.AUTHOR.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Author.AUTHOR.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Author.AUTHOR.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return Author.AUTHOR.DATE_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return Author.AUTHOR.YEAR_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field6() {
		return Author.AUTHOR.DISTINGUISHED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value4() {
		return getDateOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getYearOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value6() {
		return getDistinguished();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthorRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthorRecord value2(String value) {
		setFirstName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthorRecord value3(String value) {
		setLastName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthorRecord value4(Date value) {
		setDateOfBirth(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthorRecord value5(Integer value) {
		setYearOfBirth(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthorRecord value6(Byte value) {
		setDistinguished(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthorRecord values(Integer value1, String value2, String value3, Date value4,
			Integer value5, Byte value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AuthorRecord
	 */
	public AuthorRecord() {
		super(Author.AUTHOR);
	}

	/**
	 * Create a detached, initialised AuthorRecord
	 */
	public AuthorRecord(Integer id, String firstName, String lastName, Date dateOfBirth,
			Integer yearOfBirth, Byte distinguished) {
		super(Author.AUTHOR);

		setValue(0, id);
		setValue(1, firstName);
		setValue(2, lastName);
		setValue(3, dateOfBirth);
		setValue(4, yearOfBirth);
		setValue(5, distinguished);
	}
}
