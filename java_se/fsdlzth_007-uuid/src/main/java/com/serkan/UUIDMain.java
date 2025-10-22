package com.serkan;


import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class UUIDMain {
 public  static void main() {
        /*
        Overview of UUID in Java
        A UUID (Universally Unique Identifier) is a 128‑bit identifier commonly represented as 32 hexadecimal digits separated by hyphens
        into five groups (36 characters total) used to uniquely identify information in distributed systems.
        Java provides built‑in support for UUIDs via the java.util.UUID class, which includes methods to generate, parse, and inspect UUID values.
         */

        /*
        UUID structure and versions
        - Size and format: A UUID is 128 bits and is typically shown as 36 characters like 123e4567-e89b-12d3-a456-426655440000.
        - Version: The UUID contains a 4‑bit version field that indicates how the UUID was generated (for example, version 4 is random,
          version 3 and 5 are name‑based). The version bits appear in the third group of the textual representation.

        - Variant: The UUID also contains a variant field that specifies the layout; the common variant in modern UUIDs is the IETF variant (value 2).
        References for structure and meaning come from Java and UUID specifications.
        */

        /*
        Using java.util.UUID in code
        Create random UUID (version 4)
        - What it does: UUID.randomUUID() generates a cryptographically strong random UUID (version 4 in typical OpenJDK/Oracle implementations).
         */


     //- Example
     UUID uuid = UUID.randomUUID();                 // generate a random UUID
     System.out.println("UUID: " + uuid.toString()); // prints e.g. 3f0a1e1e-8a2f-4c3d-9b7d-2f1b6c7a8d9e
     //- Explanation: randomUUID() returns a UUID object with random bits; the textual toString() shows the standard 36‑character representation.


     /*
        Create UUID from string
        -What it does: UUID.fromString(String) parses the standard UUID string back into a UUID object; the string must follow the canonical format with hyphens.
      */
     //- Example
     UUID parsed = UUID.fromString("3f0a1e1e-8a2f-4c3d-9b7d-2f1b6c7a8d9e");
     System.out.println("Variant: " + parsed.variant());
     System.out.println("Version: " + parsed.version());
     //- Explanation: After parsing you can call methods like variant() and version() to inspect the fields embedded in the UUID.

       /*
         Create name‑based UUIDs (version 3/5)
        - What it does: UUID.nameUUIDFromBytes(byte[]) produces a deterministic UUID from given bytes (name‑based, typically version 3 using MD5 in Java's method).
        */
      //- Example
     byte[] nameBytes = "my-entity-identifier".getBytes(StandardCharsets.UTF_8);
     UUID nameUuid = UUID.nameUUIDFromBytes(nameBytes);
     System.out.println("Name-based UUID: " + nameUuid);
     //- Explanation: Calling the method with the same byte array always yields the same UUID, useful when you need reproducible identifiers derived from strings or other data.

       /*
          Construct UUID from two longs
        - What it does: new UUID(long mostSigBits, long leastSigBits) creates a UUID when you already know the 128‑bit pattern.
        */
      //- Example
     long msb = 0x12345678abcdef00L;
     long lsb = 0x0fedcba987654321L;
     UUID custom = new UUID(msb, lsb);
     System.out.println(custom);
      //- Explanation: This is low‑level and rarely required; it’s mainly useful when recreating UUIDs from stored bit patterns

       /*
        Practical examples and common tasks
        Remove hyphens for compact keys
         */
     UUID uuid2 = UUID.randomUUID();

     String compact = uuid2.toString().replace("-", "");  // 32 hex characters
     System.out.println(compact);
         /*
        - Use case: shorter keys for URLs or database keys; keep in mind you lose the hyphen grouping but not uniqueness.
         */








 }
}
