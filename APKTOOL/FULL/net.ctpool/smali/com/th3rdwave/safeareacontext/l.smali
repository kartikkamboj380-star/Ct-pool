.class public final enum Lcom/th3rdwave/safeareacontext/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum m:Lcom/th3rdwave/safeareacontext/l;

.field public static final enum n:Lcom/th3rdwave/safeareacontext/l;

.field public static final enum o:Lcom/th3rdwave/safeareacontext/l;

.field private static final synthetic p:[Lcom/th3rdwave/safeareacontext/l;

.field private static final synthetic q:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/th3rdwave/safeareacontext/l;

    const-string v1, "OFF"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/th3rdwave/safeareacontext/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/th3rdwave/safeareacontext/l;->m:Lcom/th3rdwave/safeareacontext/l;

    new-instance v0, Lcom/th3rdwave/safeareacontext/l;

    const-string v1, "ADDITIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/th3rdwave/safeareacontext/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/th3rdwave/safeareacontext/l;->n:Lcom/th3rdwave/safeareacontext/l;

    new-instance v0, Lcom/th3rdwave/safeareacontext/l;

    const-string v1, "MAXIMUM"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/th3rdwave/safeareacontext/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/th3rdwave/safeareacontext/l;->o:Lcom/th3rdwave/safeareacontext/l;

    invoke-static {}, Lcom/th3rdwave/safeareacontext/l;->e()[Lcom/th3rdwave/safeareacontext/l;

    move-result-object v0

    sput-object v0, Lcom/th3rdwave/safeareacontext/l;->p:[Lcom/th3rdwave/safeareacontext/l;

    invoke-static {v0}, Lp5/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/th3rdwave/safeareacontext/l;->q:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lcom/th3rdwave/safeareacontext/l;
    .locals 3

    .line 1
    sget-object v0, Lcom/th3rdwave/safeareacontext/l;->m:Lcom/th3rdwave/safeareacontext/l;

    sget-object v1, Lcom/th3rdwave/safeareacontext/l;->n:Lcom/th3rdwave/safeareacontext/l;

    sget-object v2, Lcom/th3rdwave/safeareacontext/l;->o:Lcom/th3rdwave/safeareacontext/l;

    filled-new-array {v0, v1, v2}, [Lcom/th3rdwave/safeareacontext/l;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/th3rdwave/safeareacontext/l;
    .locals 1

    const-class v0, Lcom/th3rdwave/safeareacontext/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/th3rdwave/safeareacontext/l;

    return-object p0
.end method

.method public static values()[Lcom/th3rdwave/safeareacontext/l;
    .locals 1

    sget-object v0, Lcom/th3rdwave/safeareacontext/l;->p:[Lcom/th3rdwave/safeareacontext/l;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/th3rdwave/safeareacontext/l;

    return-object v0
.end method
