package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.logic.commands.FilterByEducationCommand;
import seedu.address.logic.commands.FilterByTimeCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Filter by education command parser
 */
public class FilterByEducationCommandParser {
    /**
     * FilterByGradeCommand
     *
     * @param args
     * @return
     * @throws ParseException
     */
    public FilterByEducationCommand parse(String args) throws ParseException {

        String stringCommand = args.trim();
        if (stringCommand.isEmpty()) {
            throw new ParseException(
                    String.format("Enter error message here"));
        }
        if (!(stringCommand.equals("Primary") || stringCommand.equals("Secondary") || stringCommand.equals("JC"))) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, FilterByTimeCommand.MESSAGE_USAGE));
        }
        return new FilterByEducationCommand(stringCommand);
    }
}