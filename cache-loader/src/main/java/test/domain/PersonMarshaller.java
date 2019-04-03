package test.domain;

import java.io.IOException;

import org.infinispan.protostream.MessageMarshaller;

public class PersonMarshaller implements MessageMarshaller<Person> {
   @Override
   public Person readFrom(ProtoStreamReader reader) throws IOException {
      Long id = reader.readLong("id");
      String name = reader.readString("name");
      Integer age = reader.readInt("age");
      return new Person(id, name, age);
   }

   @Override
   public void writeTo(ProtoStreamWriter writer, Person person) throws IOException {
      writer.writeLong("id", person.getId());
      writer.writeString("name", person.getName());
      writer.writeInt("age", person.getAge());
   }

   @Override
   public Class<? extends Person> getJavaClass() {
      return Person.class;
   }

   @Override
   public String getTypeName() {
      return "test.Person";
   }
}
