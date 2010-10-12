/*
 * Copyright (c) 2010, Stanislav Muhametsin. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.sql.generation.api.grammar.builders.definition;

import java.util.List;

import org.sql.generation.api.grammar.builders.AbstractBuilder;
import org.sql.generation.api.grammar.definition.schema.SchemaDefinition;
import org.sql.generation.api.grammar.definition.schema.SchemaElement;

/**
 * This is builder interface for creating schema definition statements ({@code CREATE SCHEMA} ...).
 * 
 * @author Stanislav Muhametsin
 */
public interface SchemaDefinitionBuilder
    extends AbstractBuilder<SchemaDefinition>
{

    /**
     * Sets the name for the schema to be created.
     * 
     * @param schemaName The name for the schema to be created.
     * @return This builder.
     */
    public SchemaDefinitionBuilder setSchemaName( String schemaName );

    /**
     * Sets the character set for the schema to be created.
     * 
     * @param charset The charset for the schema to be created.
     * @return This builder.
     */
    public SchemaDefinitionBuilder setSchemaCharset( String charset );

    /**
     * Adds schema element for the schema to be created.
     * 
     * @param element The schema element for the schema to be created.
     * @return This builder.
     * @see SchemaElement
     */
    public SchemaDefinitionBuilder addSchemaElement( SchemaElement element );

    /**
     * Returns the name of the schema to be created.
     * 
     * @return The name of the schema to be created.
     */
    public String getSchemaName();

    /**
     * Returns the name of the character set for the schema to be created.
     * 
     * @return The name of the character set for the schema to be created.
     */
    public String getSchemaCharset();

    /**
     * Returns all the schema elements for the schema to be created.
     * 
     * @return All the schema elements for the schema to be created.
     */
    public List<String> getSchemaElements();
}
