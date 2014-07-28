/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ConfSyncResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ConfSyncResponse\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"confSchemaBody\",\"type\":[\"bytes\",\"null\"]},{\"name\":\"confDeltaBody\",\"type\":[\"bytes\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.nio.ByteBuffer confSchemaBody;
   private java.nio.ByteBuffer confDeltaBody;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public ConfSyncResponse() {}

  /**
   * All-args constructor.
   */
  public ConfSyncResponse(java.nio.ByteBuffer confSchemaBody, java.nio.ByteBuffer confDeltaBody) {
    this.confSchemaBody = confSchemaBody;
    this.confDeltaBody = confDeltaBody;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return confSchemaBody;
    case 1: return confDeltaBody;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: confSchemaBody = (java.nio.ByteBuffer)value$; break;
    case 1: confDeltaBody = (java.nio.ByteBuffer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'confSchemaBody' field.
   */
  public java.nio.ByteBuffer getConfSchemaBody() {
    return confSchemaBody;
  }

  /**
   * Sets the value of the 'confSchemaBody' field.
   * @param value the value to set.
   */
  public void setConfSchemaBody(java.nio.ByteBuffer value) {
    this.confSchemaBody = value;
  }

  /**
   * Gets the value of the 'confDeltaBody' field.
   */
  public java.nio.ByteBuffer getConfDeltaBody() {
    return confDeltaBody;
  }

  /**
   * Sets the value of the 'confDeltaBody' field.
   * @param value the value to set.
   */
  public void setConfDeltaBody(java.nio.ByteBuffer value) {
    this.confDeltaBody = value;
  }

  /** Creates a new ConfSyncResponse RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.ConfSyncResponse.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.ConfSyncResponse.Builder();
  }
  
  /** Creates a new ConfSyncResponse RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.ConfSyncResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.ConfSyncResponse.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.ConfSyncResponse.Builder(other);
  }
  
  /** Creates a new ConfSyncResponse RecordBuilder by copying an existing ConfSyncResponse instance */
  public static org.kaaproject.kaa.common.endpoint.gen.ConfSyncResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.ConfSyncResponse other) {
    return new org.kaaproject.kaa.common.endpoint.gen.ConfSyncResponse.Builder(other);
  }
  
  /**
   * RecordBuilder for ConfSyncResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ConfSyncResponse>
    implements org.apache.avro.data.RecordBuilder<ConfSyncResponse> {

    private java.nio.ByteBuffer confSchemaBody;
    private java.nio.ByteBuffer confDeltaBody;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.ConfSyncResponse.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.ConfSyncResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.confSchemaBody)) {
        this.confSchemaBody = data().deepCopy(fields()[0].schema(), other.confSchemaBody);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.confDeltaBody)) {
        this.confDeltaBody = data().deepCopy(fields()[1].schema(), other.confDeltaBody);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing ConfSyncResponse instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.ConfSyncResponse other) {
            super(org.kaaproject.kaa.common.endpoint.gen.ConfSyncResponse.SCHEMA$);
      if (isValidValue(fields()[0], other.confSchemaBody)) {
        this.confSchemaBody = data().deepCopy(fields()[0].schema(), other.confSchemaBody);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.confDeltaBody)) {
        this.confDeltaBody = data().deepCopy(fields()[1].schema(), other.confDeltaBody);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'confSchemaBody' field */
    public java.nio.ByteBuffer getConfSchemaBody() {
      return confSchemaBody;
    }
    
    /** Sets the value of the 'confSchemaBody' field */
    public org.kaaproject.kaa.common.endpoint.gen.ConfSyncResponse.Builder setConfSchemaBody(java.nio.ByteBuffer value) {
      validate(fields()[0], value);
      this.confSchemaBody = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'confSchemaBody' field has been set */
    public boolean hasConfSchemaBody() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'confSchemaBody' field */
    public org.kaaproject.kaa.common.endpoint.gen.ConfSyncResponse.Builder clearConfSchemaBody() {
      confSchemaBody = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'confDeltaBody' field */
    public java.nio.ByteBuffer getConfDeltaBody() {
      return confDeltaBody;
    }
    
    /** Sets the value of the 'confDeltaBody' field */
    public org.kaaproject.kaa.common.endpoint.gen.ConfSyncResponse.Builder setConfDeltaBody(java.nio.ByteBuffer value) {
      validate(fields()[1], value);
      this.confDeltaBody = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'confDeltaBody' field has been set */
    public boolean hasConfDeltaBody() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'confDeltaBody' field */
    public org.kaaproject.kaa.common.endpoint.gen.ConfSyncResponse.Builder clearConfDeltaBody() {
      confDeltaBody = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public ConfSyncResponse build() {
      try {
        ConfSyncResponse record = new ConfSyncResponse();
        record.confSchemaBody = fieldSetFlags()[0] ? this.confSchemaBody : (java.nio.ByteBuffer) defaultValue(fields()[0]);
        record.confDeltaBody = fieldSetFlags()[1] ? this.confDeltaBody : (java.nio.ByteBuffer) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}