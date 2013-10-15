/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.shirdrn.queryproxy.thrift.protocol;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueryParams implements org.apache.thrift.TBase<QueryParams, QueryParams._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("QueryParams");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("TYPE", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("table", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("params", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QueryParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QueryParamsTupleSchemeFactory());
  }

  /**
   * 
   * @see QueryType
   */
  public QueryType TYPE; // required
  public String table; // required
  public List<String> params; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see QueryType
     */
    TYPE((short)1, "TYPE"),
    TABLE((short)2, "table"),
    PARAMS((short)3, "params");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // TABLE
          return TABLE;
        case 3: // PARAMS
          return PARAMS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("TYPE", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, QueryType.class)));
    tmpMap.put(_Fields.TABLE, new org.apache.thrift.meta_data.FieldMetaData("table", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAMS, new org.apache.thrift.meta_data.FieldMetaData("params", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(QueryParams.class, metaDataMap);
  }

  public QueryParams() {
  }

  public QueryParams(
    QueryType TYPE,
    String table,
    List<String> params)
  {
    this();
    this.TYPE = TYPE;
    this.table = table;
    this.params = params;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryParams(QueryParams other) {
    if (other.isSetTYPE()) {
      this.TYPE = other.TYPE;
    }
    if (other.isSetTable()) {
      this.table = other.table;
    }
    if (other.isSetParams()) {
      List<String> __this__params = new ArrayList<String>();
      for (String other_element : other.params) {
        __this__params.add(other_element);
      }
      this.params = __this__params;
    }
  }

  public QueryParams deepCopy() {
    return new QueryParams(this);
  }

  @Override
  public void clear() {
    this.TYPE = null;
    this.table = null;
    this.params = null;
  }

  /**
   * 
   * @see QueryType
   */
  public QueryType getTYPE() {
    return this.TYPE;
  }

  /**
   * 
   * @see QueryType
   */
  public QueryParams setTYPE(QueryType TYPE) {
    this.TYPE = TYPE;
    return this;
  }

  public void unsetTYPE() {
    this.TYPE = null;
  }

  /** Returns true if field TYPE is set (has been assigned a value) and false otherwise */
  public boolean isSetTYPE() {
    return this.TYPE != null;
  }

  public void setTYPEIsSet(boolean value) {
    if (!value) {
      this.TYPE = null;
    }
  }

  public String getTable() {
    return this.table;
  }

  public QueryParams setTable(String table) {
    this.table = table;
    return this;
  }

  public void unsetTable() {
    this.table = null;
  }

  /** Returns true if field table is set (has been assigned a value) and false otherwise */
  public boolean isSetTable() {
    return this.table != null;
  }

  public void setTableIsSet(boolean value) {
    if (!value) {
      this.table = null;
    }
  }

  public int getParamsSize() {
    return (this.params == null) ? 0 : this.params.size();
  }

  public java.util.Iterator<String> getParamsIterator() {
    return (this.params == null) ? null : this.params.iterator();
  }

  public void addToParams(String elem) {
    if (this.params == null) {
      this.params = new ArrayList<String>();
    }
    this.params.add(elem);
  }

  public List<String> getParams() {
    return this.params;
  }

  public QueryParams setParams(List<String> params) {
    this.params = params;
    return this;
  }

  public void unsetParams() {
    this.params = null;
  }

  /** Returns true if field params is set (has been assigned a value) and false otherwise */
  public boolean isSetParams() {
    return this.params != null;
  }

  public void setParamsIsSet(boolean value) {
    if (!value) {
      this.params = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetTYPE();
      } else {
        setTYPE((QueryType)value);
      }
      break;

    case TABLE:
      if (value == null) {
        unsetTable();
      } else {
        setTable((String)value);
      }
      break;

    case PARAMS:
      if (value == null) {
        unsetParams();
      } else {
        setParams((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getTYPE();

    case TABLE:
      return getTable();

    case PARAMS:
      return getParams();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetTYPE();
    case TABLE:
      return isSetTable();
    case PARAMS:
      return isSetParams();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryParams)
      return this.equals((QueryParams)that);
    return false;
  }

  public boolean equals(QueryParams that) {
    if (that == null)
      return false;

    boolean this_present_TYPE = true && this.isSetTYPE();
    boolean that_present_TYPE = true && that.isSetTYPE();
    if (this_present_TYPE || that_present_TYPE) {
      if (!(this_present_TYPE && that_present_TYPE))
        return false;
      if (!this.TYPE.equals(that.TYPE))
        return false;
    }

    boolean this_present_table = true && this.isSetTable();
    boolean that_present_table = true && that.isSetTable();
    if (this_present_table || that_present_table) {
      if (!(this_present_table && that_present_table))
        return false;
      if (!this.table.equals(that.table))
        return false;
    }

    boolean this_present_params = true && this.isSetParams();
    boolean that_present_params = true && that.isSetParams();
    if (this_present_params || that_present_params) {
      if (!(this_present_params && that_present_params))
        return false;
      if (!this.params.equals(that.params))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(QueryParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    QueryParams typedOther = (QueryParams)other;

    lastComparison = Boolean.valueOf(isSetTYPE()).compareTo(typedOther.isSetTYPE());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTYPE()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.TYPE, typedOther.TYPE);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTable()).compareTo(typedOther.isSetTable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table, typedOther.table);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParams()).compareTo(typedOther.isSetParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.params, typedOther.params);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("QueryParams(");
    boolean first = true;

    sb.append("TYPE:");
    if (this.TYPE == null) {
      sb.append("null");
    } else {
      sb.append(this.TYPE);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("table:");
    if (this.table == null) {
      sb.append("null");
    } else {
      sb.append(this.table);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("params:");
    if (this.params == null) {
      sb.append("null");
    } else {
      sb.append(this.params);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class QueryParamsStandardSchemeFactory implements SchemeFactory {
    public QueryParamsStandardScheme getScheme() {
      return new QueryParamsStandardScheme();
    }
  }

  private static class QueryParamsStandardScheme extends StandardScheme<QueryParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, QueryParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.TYPE = QueryType.findByValue(iprot.readI32());
              struct.setTYPEIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table = iprot.readString();
              struct.setTableIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.params = new ArrayList<String>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  String _elem2; // required
                  _elem2 = iprot.readString();
                  struct.params.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, QueryParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.TYPE != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.TYPE.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.table != null) {
        oprot.writeFieldBegin(TABLE_FIELD_DESC);
        oprot.writeString(struct.table);
        oprot.writeFieldEnd();
      }
      if (struct.params != null) {
        oprot.writeFieldBegin(PARAMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.params.size()));
          for (String _iter3 : struct.params)
          {
            oprot.writeString(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QueryParamsTupleSchemeFactory implements SchemeFactory {
    public QueryParamsTupleScheme getScheme() {
      return new QueryParamsTupleScheme();
    }
  }

  private static class QueryParamsTupleScheme extends TupleScheme<QueryParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, QueryParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTYPE()) {
        optionals.set(0);
      }
      if (struct.isSetTable()) {
        optionals.set(1);
      }
      if (struct.isSetParams()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTYPE()) {
        oprot.writeI32(struct.TYPE.getValue());
      }
      if (struct.isSetTable()) {
        oprot.writeString(struct.table);
      }
      if (struct.isSetParams()) {
        {
          oprot.writeI32(struct.params.size());
          for (String _iter4 : struct.params)
          {
            oprot.writeString(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, QueryParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.TYPE = QueryType.findByValue(iprot.readI32());
        struct.setTYPEIsSet(true);
      }
      if (incoming.get(1)) {
        struct.table = iprot.readString();
        struct.setTableIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.params = new ArrayList<String>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            String _elem7; // required
            _elem7 = iprot.readString();
            struct.params.add(_elem7);
          }
        }
        struct.setParamsIsSet(true);
      }
    }
  }

}

