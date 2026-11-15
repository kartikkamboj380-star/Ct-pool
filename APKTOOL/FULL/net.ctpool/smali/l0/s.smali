.class public final enum Ll0/s;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum m:Ll0/s;

.field public static final enum n:Ll0/s;

.field public static final enum o:Ll0/s;

.field public static final enum p:Ll0/s;

.field public static final enum q:Ll0/s;

.field public static final enum r:Ll0/s;

.field private static final synthetic s:[Ll0/s;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ll0/s;

    .line 2
    .line 3
    const-string v1, "ENQUEUED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ll0/s;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ll0/s;->m:Ll0/s;

    .line 10
    .line 11
    new-instance v0, Ll0/s;

    .line 12
    .line 13
    const-string v1, "RUNNING"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Ll0/s;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Ll0/s;->n:Ll0/s;

    .line 20
    .line 21
    new-instance v0, Ll0/s;

    .line 22
    .line 23
    const-string v1, "SUCCEEDED"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Ll0/s;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Ll0/s;->o:Ll0/s;

    .line 30
    .line 31
    new-instance v0, Ll0/s;

    .line 32
    .line 33
    const-string v1, "FAILED"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Ll0/s;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Ll0/s;->p:Ll0/s;

    .line 40
    .line 41
    new-instance v0, Ll0/s;

    .line 42
    .line 43
    const-string v1, "BLOCKED"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Ll0/s;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Ll0/s;->q:Ll0/s;

    .line 50
    .line 51
    new-instance v0, Ll0/s;

    .line 52
    .line 53
    const-string v1, "CANCELLED"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2}, Ll0/s;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Ll0/s;->r:Ll0/s;

    .line 60
    .line 61
    invoke-static {}, Ll0/s;->e()[Ll0/s;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Ll0/s;->s:[Ll0/s;

    .line 66
    .line 67
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic e()[Ll0/s;
    .locals 6

    .line 1
    sget-object v0, Ll0/s;->m:Ll0/s;

    .line 2
    .line 3
    sget-object v1, Ll0/s;->n:Ll0/s;

    .line 4
    .line 5
    sget-object v2, Ll0/s;->o:Ll0/s;

    .line 6
    .line 7
    sget-object v3, Ll0/s;->p:Ll0/s;

    .line 8
    .line 9
    sget-object v4, Ll0/s;->q:Ll0/s;

    .line 10
    .line 11
    sget-object v5, Ll0/s;->r:Ll0/s;

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Ll0/s;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ll0/s;
    .locals 1

    .line 1
    const-class v0, Ll0/s;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ll0/s;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ll0/s;
    .locals 1

    .line 1
    sget-object v0, Ll0/s;->s:[Ll0/s;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ll0/s;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ll0/s;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public h()Z
    .locals 1

    .line 1
    sget-object v0, Ll0/s;->o:Ll0/s;

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Ll0/s;->p:Ll0/s;

    .line 6
    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    sget-object v0, Ll0/s;->r:Ll0/s;

    .line 10
    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    :goto_1
    return v0
.end method
