/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package kr.co.jaso.blog.hadoop.generated;

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

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class ServiceStatus implements TBase<ServiceStatus, ServiceStatus._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ServiceStatus");

  private static final TField HOST_NAME_FIELD_DESC = new TField("hostName", TType.STRING, (short)1);
  private static final TField PORT_FIELD_DESC = new TField("port", TType.I32, (short)2);
  private static final TField STATUS_FIELD_DESC = new TField("status", TType.STRING, (short)3);

  public String hostName;
  public int port;
  public String status;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    HOST_NAME((short)1, "hostName"),
    PORT((short)2, "port"),
    STATUS((short)3, "status");

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
        case 1: // HOST_NAME
          return HOST_NAME;
        case 2: // PORT
          return PORT;
        case 3: // STATUS
          return STATUS;
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
  private static final int __PORT_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HOST_NAME, new FieldMetaData("hostName", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.PORT, new FieldMetaData("port", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.STATUS, new FieldMetaData("status", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ServiceStatus.class, metaDataMap);
  }

  public ServiceStatus() {
  }

  public ServiceStatus(
    String hostName,
    int port,
    String status)
  {
    this();
    this.hostName = hostName;
    this.port = port;
    setPortIsSet(true);
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ServiceStatus(ServiceStatus other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetHostName()) {
      this.hostName = other.hostName;
    }
    this.port = other.port;
    if (other.isSetStatus()) {
      this.status = other.status;
    }
  }

  public ServiceStatus deepCopy() {
    return new ServiceStatus(this);
  }

  @Override
  public void clear() {
    this.hostName = null;
    setPortIsSet(false);
    this.port = 0;
    this.status = null;
  }

  public String getHostName() {
    return this.hostName;
  }

  public ServiceStatus setHostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

  public void unsetHostName() {
    this.hostName = null;
  }

  /** Returns true if field hostName is set (has been asigned a value) and false otherwise */
  public boolean isSetHostName() {
    return this.hostName != null;
  }

  public void setHostNameIsSet(boolean value) {
    if (!value) {
      this.hostName = null;
    }
  }

  public int getPort() {
    return this.port;
  }

  public ServiceStatus setPort(int port) {
    this.port = port;
    setPortIsSet(true);
    return this;
  }

  public void unsetPort() {
    __isset_bit_vector.clear(__PORT_ISSET_ID);
  }

  /** Returns true if field port is set (has been asigned a value) and false otherwise */
  public boolean isSetPort() {
    return __isset_bit_vector.get(__PORT_ISSET_ID);
  }

  public void setPortIsSet(boolean value) {
    __isset_bit_vector.set(__PORT_ISSET_ID, value);
  }

  public String getStatus() {
    return this.status;
  }

  public ServiceStatus setStatus(String status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been asigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HOST_NAME:
      if (value == null) {
        unsetHostName();
      } else {
        setHostName((String)value);
      }
      break;

    case PORT:
      if (value == null) {
        unsetPort();
      } else {
        setPort((Integer)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HOST_NAME:
      return getHostName();

    case PORT:
      return new Integer(getPort());

    case STATUS:
      return getStatus();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HOST_NAME:
      return isSetHostName();
    case PORT:
      return isSetPort();
    case STATUS:
      return isSetStatus();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ServiceStatus)
      return this.equals((ServiceStatus)that);
    return false;
  }

  public boolean equals(ServiceStatus that) {
    if (that == null)
      return false;

    boolean this_present_hostName = true && this.isSetHostName();
    boolean that_present_hostName = true && that.isSetHostName();
    if (this_present_hostName || that_present_hostName) {
      if (!(this_present_hostName && that_present_hostName))
        return false;
      if (!this.hostName.equals(that.hostName))
        return false;
    }

    boolean this_present_port = true;
    boolean that_present_port = true;
    if (this_present_port || that_present_port) {
      if (!(this_present_port && that_present_port))
        return false;
      if (this.port != that.port)
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ServiceStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ServiceStatus typedOther = (ServiceStatus)other;

    lastComparison = Boolean.valueOf(isSetHostName()).compareTo(typedOther.isSetHostName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHostName()) {
      lastComparison = TBaseHelper.compareTo(this.hostName, typedOther.hostName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPort()).compareTo(typedOther.isSetPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPort()) {
      lastComparison = TBaseHelper.compareTo(this.port, typedOther.port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(typedOther.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // HOST_NAME
          if (field.type == TType.STRING) {
            this.hostName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // PORT
          if (field.type == TType.I32) {
            this.port = iprot.readI32();
            setPortIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // STATUS
          if (field.type == TType.STRING) {
            this.status = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.hostName != null) {
      oprot.writeFieldBegin(HOST_NAME_FIELD_DESC);
      oprot.writeString(this.hostName);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(PORT_FIELD_DESC);
    oprot.writeI32(this.port);
    oprot.writeFieldEnd();
    if (this.status != null) {
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeString(this.status);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ServiceStatus(");
    boolean first = true;

    sb.append("hostName:");
    if (this.hostName == null) {
      sb.append("null");
    } else {
      sb.append(this.hostName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("port:");
    sb.append(this.port);
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
