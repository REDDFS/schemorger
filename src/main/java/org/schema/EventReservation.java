package org.schema;

/**
 *
 * A reservation for an event like a concert, sporting event, or lecture.
 *
 * @fullPath Thing > Intangible > Reservation > EventReservation
 *
 * @author Texelz (by Onhate)
 *
 */
public class EventReservation extends Reservation {

	private String reservationNumber;
	private Integer numSeats;
	private String venueRow;
	private String venueSection;
	private String ticketToken;

	/**
	 *
	 * @return The number or id of the reservation
	 */
	public String getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(String reservationNumber) {
		this.reservationNumber = reservationNumber;
	}

	/**
	 * Used for unreserved tickets or for non seat level reserved tickets.
	 *
	 * @return Gives number of seats in the reservation.
	 */
	public Integer getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(Integer numSeats) {
		this.numSeats = numSeats;
	}

	/**
	 * The row of the seat(s)
	 *
	 * @return
	 */
	public String getVenueRow() {
		return venueRow;
	}

	public void setVenueRow(String venueRow) {
		this.venueRow = venueRow;
	}

	/**
	 * The section of the seat(s)
	 *
	 * @return
	 */
	public String getVenueSection() {
		return venueSection;
	}

	public void setVenueSection(String venueSection) {
		this.venueSection = venueSection;
	}

	/**
	 * If the barcode image is hosted on your site, the value of the field is URL of the image, or a barcode or QR URI, such as "barcode128:AB34" (ISO-15417
	 * barcodes), "qrCode:AB34" (QR codes), "aztecCode:AB34" (Aztec codes), "barcodeEAN:1234" (EAN codes) and "barcodeUPCA:1234" (UPCA codes).
	 *
	 * @return
	 */
	public String getTicketToken() {
		return ticketToken;
	}

	public void setTicketToken(String ticketToken) {
		this.ticketToken = ticketToken;
	}

}
