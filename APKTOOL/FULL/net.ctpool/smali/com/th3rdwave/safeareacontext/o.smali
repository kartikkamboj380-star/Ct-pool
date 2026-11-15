.class public final enum Lcom/th3rdwave/safeareacontext/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum m:Lcom/th3rdwave/safeareacontext/o;

.field public static final enum n:Lcom/th3rdwave/safeareacontext/o;

.field private static final synthetic o:[Lcom/th3rdwave/safeareacontext/o;

.field private static final synthetic p:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/th3rdwave/safeareacontext/o;

    const-string v1, "PADDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/th3rdwave/safeareacontext/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/th3rdwave/safeareacontext/o;->m:Lcom/th3rdwave/safeareacontext/o;

    new-instance v0, Lcom/th3rdwave/safeareacontext/o;

    const-string v1, "MARGIN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/th3rdwave/safeareacontext/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/th3rdwave/safeareacontext/o;->n:Lcom/th3rdwave/safeareacontext/o;

    invoke-static {}, Lcom/th3rdwave/safeareacontext/o;->e()[Lcom/th3rdwave/safeareacontext/o;

    move-result-object v0

    sput-object v0, Lcom/th3rdwave/safeareacontext/o;->o:[Lcom/th3rdwave/safeareacontext/o;

    invoke-static {v0}, Lp5/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/th3rdwave/safeareacontext/o;->p:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lcom/th3rdwave/safeareacontext/o;
    .locals 2

    .line 1
    sget-object v0, Lcom/th3rdwave/safeareacontext/o;->m:Lcom/th3rdwave/safeareacontext/o;

    sget-object v1, Lcom/th3rdwave/safeareacontext/o;->n:Lcom/th3rdwave/safeareacontext/o;

    filled-new-array {v0, v1}, [Lcom/th3rdwave/safeareacontext/o;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/th3rdwave/safeareacontext/o;
    .locals 1

    const-class v0, Lcom/th3rdwave/safeareacontext/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/th3rdwave/safeareacontext/o;

    return-object p0
.end method

.method public static values()[Lcom/th3rdwave/safeareacontext/o;
    .locals 1

    sget-object v0, Lcom/th3rdwave/safeareacontext/o;->o:[Lcom/th3rdwave/safeareacontext/o;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/th3rdwave/safeareacontext/o;

    return-object v0
.end method
