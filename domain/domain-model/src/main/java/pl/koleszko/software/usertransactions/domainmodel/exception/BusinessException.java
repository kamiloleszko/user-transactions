package pl.koleszko.software.usertransactions.domainmodel.exception;

import lombok.Getter;

import java.text.MessageFormat;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
import static java.util.UUID.randomUUID;
import static org.apache.logging.log4j.util.Strings.EMPTY;

@Getter
public abstract class BusinessException extends RuntimeException {

    private static final long serialVersionUID = -529049296232061978L;

    private final ExceptionCode exceptionCode;
    private final List<String> arguments;
    private final String issueId;

    protected BusinessException(ExceptionCode exceptionCode, String... arguments) {
        this(randomUUID().toString(), exceptionCode, arguments);
    }

    protected BusinessException(String issueId, ExceptionCode exceptionCode, String... arguments) {
        super(format(exceptionCode, arguments));
        this.issueId = issueId;
        this.exceptionCode = exceptionCode;
        this.arguments = (isNull(arguments) ? emptyList() : asList(arguments));
    }

    private static String format(ExceptionCode exceptionCode, Object[] arguments) {
        return nonNull(exceptionCode) && nonNull(exceptionCode.getMessage()) ? MessageFormat.format(exceptionCode.getMessage(), arguments) : EMPTY;
    }
}
