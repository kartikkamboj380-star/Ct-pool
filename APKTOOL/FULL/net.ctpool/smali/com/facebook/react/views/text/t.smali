.class public final enum Lcom/facebook/react/views/text/t;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum m:Lcom/facebook/react/views/text/t;

.field public static final enum n:Lcom/facebook/react/views/text/t;

.field public static final enum o:Lcom/facebook/react/views/text/t;

.field public static final enum p:Lcom/facebook/react/views/text/t;

.field public static final enum q:Lcom/facebook/react/views/text/t;

.field private static final synthetic r:[Lcom/facebook/react/views/text/t;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/react/views/text/t;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/text/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/views/text/t;->m:Lcom/facebook/react/views/text/t;

    new-instance v0, Lcom/facebook/react/views/text/t;

    const-string v1, "UPPERCASE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/text/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/views/text/t;->n:Lcom/facebook/react/views/text/t;

    new-instance v0, Lcom/facebook/react/views/text/t;

    const-string v1, "LOWERCASE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/text/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/views/text/t;->o:Lcom/facebook/react/views/text/t;

    new-instance v0, Lcom/facebook/react/views/text/t;

    const-string v1, "CAPITALIZE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/text/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/views/text/t;->p:Lcom/facebook/react/views/text/t;

    new-instance v0, Lcom/facebook/react/views/text/t;

    const-string v1, "UNSET"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/text/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/views/text/t;->q:Lcom/facebook/react/views/text/t;

    invoke-static {}, Lcom/facebook/react/views/text/t;->e()[Lcom/facebook/react/views/text/t;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/views/text/t;->r:[Lcom/facebook/react/views/text/t;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic e()[Lcom/facebook/react/views/text/t;
    .locals 5

    .line 1
    sget-object v0, Lcom/facebook/react/views/text/t;->m:Lcom/facebook/react/views/text/t;

    sget-object v1, Lcom/facebook/react/views/text/t;->n:Lcom/facebook/react/views/text/t;

    sget-object v2, Lcom/facebook/react/views/text/t;->o:Lcom/facebook/react/views/text/t;

    sget-object v3, Lcom/facebook/react/views/text/t;->p:Lcom/facebook/react/views/text/t;

    sget-object v4, Lcom/facebook/react/views/text/t;->q:Lcom/facebook/react/views/text/t;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/facebook/react/views/text/t;

    move-result-object v0

    return-object v0
.end method

.method public static h(Ljava/lang/String;Lcom/facebook/react/views/text/t;)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object v0, Lcom/facebook/react/views/text/t$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lcom/facebook/react/views/text/t;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static j(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-static {}, Ljava/text/BreakIterator;->getWordInstance()Ljava/text/BreakIterator;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/text/BreakIterator;->setText(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0}, Ljava/text/BreakIterator;->first()I

    move-result v2

    :goto_0
    invoke-virtual {v0}, Ljava/text/BreakIterator;->next()I

    move-result v3

    move v6, v3

    move v3, v2

    move v2, v6

    const/4 v4, -0x1

    if-eq v2, v4, :cond_1

    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    :cond_0
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/react/views/text/t;
    .locals 1

    const-class v0, Lcom/facebook/react/views/text/t;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/views/text/t;

    return-object p0
.end method

.method public static values()[Lcom/facebook/react/views/text/t;
    .locals 1

    sget-object v0, Lcom/facebook/react/views/text/t;->r:[Lcom/facebook/react/views/text/t;

    invoke-virtual {v0}, [Lcom/facebook/react/views/text/t;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/views/text/t;

    return-object v0
.end method
