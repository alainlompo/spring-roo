package org.springframework.roo.addon.jpa.addon.test;

import org.springframework.roo.addon.jpa.annotations.test.RooJpaUnitTest;
import org.springframework.roo.classpath.PhysicalTypeMetadata;
import org.springframework.roo.classpath.details.annotations.populator.AbstractAnnotationValues;
import org.springframework.roo.classpath.details.annotations.populator.AutoPopulate;
import org.springframework.roo.classpath.details.annotations.populator.AutoPopulationUtils;
import org.springframework.roo.model.JavaType;
import org.springframework.roo.model.RooJavaType;

/**
 * Represents a parsed {@link RooJpaUnitTest} annotation.
 * 
 * @author Sergio Clares
 * @since 2.0
 */
public class JpaUnitTestAnnotationValues extends AbstractAnnotationValues {

  @AutoPopulate
  private JavaType targetClass = null;

  public JpaUnitTestAnnotationValues(final PhysicalTypeMetadata governorPhysicalTypeMetadata) {
    super(governorPhysicalTypeMetadata, RooJavaType.ROO_JPA_UNIT_TEST);
    AutoPopulationUtils.populate(this, annotationMetadata);
  }

  public JavaType getTargetClass() {
    return targetClass;
  }
}
