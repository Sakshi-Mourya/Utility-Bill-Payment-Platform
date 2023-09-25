export class Specinvoice {
    
    "customer": {
        "customerID": number,
        "customerName": string,
        "customerEmail": string,
        "customerContact": number,
        "billID": number,
        "unitConsumption":number,
        "billDueDate": string,
        "billDuration": string
    }
    "amountDue": number
    "totalAmount": number
    "cash": boolean
    "invoiceID": number
}
