.class public final Lcom/facebook/hermes/unicode/AndroidUnicodeUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LR1/a;
.end annotation


# static fields
.field private static final FORM_C:I = 0x0

.field private static final FORM_D:I = 0x1

.field private static final FORM_KC:I = 0x2

.field private static final FORM_KD:I = 0x3

.field public static final INSTANCE:Lcom/facebook/hermes/unicode/AndroidUnicodeUtils;

.field private static final TARGET_LOWERCASE:I = 0x1

.field private static final TARGET_UPPERCASE:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/hermes/unicode/AndroidUnicodeUtils;

    invoke-direct {v0}, Lcom/facebook/hermes/unicode/AndroidUnicodeUtils;-><init>()V

    sput-object v0, Lcom/facebook/hermes/unicode/AndroidUnicodeUtils;->INSTANCE:Lcom/facebook/hermes/unicode/AndroidUnicodeUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final convertToCase(Ljava/lang/String;IZ)Ljava/lang/String;
    .locals 1
    .annotation build LR1/a;
    .end annotation

    const-string v0, "input"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    goto :goto_0

    :cond_0
    sget-object p2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    :goto_0
    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-static {p2}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "toLowerCase(...)"

    :goto_1
    invoke-static {p0, p1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Invalid target case"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "toUpperCase(...)"

    goto :goto_1

    :goto_2
    return-object p0
.end method

.method public static final dateFormat(DZZ)Ljava/lang/String;
    .locals 1
    .annotation build LR1/a;
    .end annotation

    const/4 v0, 0x2

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    invoke-static {v0, v0}, Ljava/text/DateFormat;->getDateTimeInstance(II)Ljava/text/DateFormat;

    move-result-object p2

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {v0}, Ljava/text/DateFormat;->getDateInstance(I)Ljava/text/DateFormat;

    move-result-object p2

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    invoke-static {v0}, Ljava/text/DateFormat;->getTimeInstance(I)Ljava/text/DateFormat;

    move-result-object p2

    :goto_0
    double-to-long p0, p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Bad dateFormat configuration"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final localeCompare(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1
    .annotation build LR1/a;
    .end annotation

    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static final normalize(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2
    .annotation build LR1/a;
    .end annotation

    const-string v0, "normalize(...)"

    if-eqz p1, :cond_3

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 v1, 0x3

    if-ne p1, v1, :cond_0

    sget-object p1, Ljava/text/Normalizer$Form;->NFKD:Ljava/text/Normalizer$Form;

    :goto_0
    invoke-static {p0, p1}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Invalid form"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object p1, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    goto :goto_0

    :cond_2
    sget-object p1, Ljava/text/Normalizer$Form;->NFD:Ljava/text/Normalizer$Form;

    goto :goto_0

    :cond_3
    sget-object p1, Ljava/text/Normalizer$Form;->NFC:Ljava/text/Normalizer$Form;

    goto :goto_0

    :goto_1
    return-object p0
.end method
