.class public final enum Lcom/facebook/yoga/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum n:Lcom/facebook/yoga/j;

.field public static final enum o:Lcom/facebook/yoga/j;

.field public static final enum p:Lcom/facebook/yoga/j;

.field public static final enum q:Lcom/facebook/yoga/j;

.field public static final enum r:Lcom/facebook/yoga/j;

.field public static final enum s:Lcom/facebook/yoga/j;

.field public static final enum t:Lcom/facebook/yoga/j;

.field public static final enum u:Lcom/facebook/yoga/j;

.field public static final enum v:Lcom/facebook/yoga/j;

.field private static final synthetic w:[Lcom/facebook/yoga/j;


# instance fields
.field private final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/yoga/j;

    const-string v1, "LEFT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/j;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/j;->n:Lcom/facebook/yoga/j;

    new-instance v0, Lcom/facebook/yoga/j;

    const-string v1, "TOP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/j;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/j;->o:Lcom/facebook/yoga/j;

    new-instance v0, Lcom/facebook/yoga/j;

    const-string v1, "RIGHT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/j;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/j;->p:Lcom/facebook/yoga/j;

    new-instance v0, Lcom/facebook/yoga/j;

    const-string v1, "BOTTOM"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/j;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/j;->q:Lcom/facebook/yoga/j;

    new-instance v0, Lcom/facebook/yoga/j;

    const-string v1, "START"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/j;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/j;->r:Lcom/facebook/yoga/j;

    new-instance v0, Lcom/facebook/yoga/j;

    const-string v1, "END"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/j;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/j;->s:Lcom/facebook/yoga/j;

    new-instance v0, Lcom/facebook/yoga/j;

    const-string v1, "HORIZONTAL"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/j;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/j;->t:Lcom/facebook/yoga/j;

    new-instance v0, Lcom/facebook/yoga/j;

    const-string v1, "VERTICAL"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/j;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/j;->u:Lcom/facebook/yoga/j;

    new-instance v0, Lcom/facebook/yoga/j;

    const-string v1, "ALL"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/j;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/j;->v:Lcom/facebook/yoga/j;

    invoke-static {}, Lcom/facebook/yoga/j;->e()[Lcom/facebook/yoga/j;

    move-result-object v0

    sput-object v0, Lcom/facebook/yoga/j;->w:[Lcom/facebook/yoga/j;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/facebook/yoga/j;->m:I

    return-void
.end method

.method private static synthetic e()[Lcom/facebook/yoga/j;
    .locals 9

    .line 1
    sget-object v0, Lcom/facebook/yoga/j;->n:Lcom/facebook/yoga/j;

    sget-object v1, Lcom/facebook/yoga/j;->o:Lcom/facebook/yoga/j;

    sget-object v2, Lcom/facebook/yoga/j;->p:Lcom/facebook/yoga/j;

    sget-object v3, Lcom/facebook/yoga/j;->q:Lcom/facebook/yoga/j;

    sget-object v4, Lcom/facebook/yoga/j;->r:Lcom/facebook/yoga/j;

    sget-object v5, Lcom/facebook/yoga/j;->s:Lcom/facebook/yoga/j;

    sget-object v6, Lcom/facebook/yoga/j;->t:Lcom/facebook/yoga/j;

    sget-object v7, Lcom/facebook/yoga/j;->u:Lcom/facebook/yoga/j;

    sget-object v8, Lcom/facebook/yoga/j;->v:Lcom/facebook/yoga/j;

    filled-new-array/range {v0 .. v8}, [Lcom/facebook/yoga/j;

    move-result-object v0

    return-object v0
.end method

.method public static h(I)Lcom/facebook/yoga/j;
    .locals 3

    .line 1
    packed-switch p0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown enum value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object p0, Lcom/facebook/yoga/j;->v:Lcom/facebook/yoga/j;

    return-object p0

    :pswitch_1
    sget-object p0, Lcom/facebook/yoga/j;->u:Lcom/facebook/yoga/j;

    return-object p0

    :pswitch_2
    sget-object p0, Lcom/facebook/yoga/j;->t:Lcom/facebook/yoga/j;

    return-object p0

    :pswitch_3
    sget-object p0, Lcom/facebook/yoga/j;->s:Lcom/facebook/yoga/j;

    return-object p0

    :pswitch_4
    sget-object p0, Lcom/facebook/yoga/j;->r:Lcom/facebook/yoga/j;

    return-object p0

    :pswitch_5
    sget-object p0, Lcom/facebook/yoga/j;->q:Lcom/facebook/yoga/j;

    return-object p0

    :pswitch_6
    sget-object p0, Lcom/facebook/yoga/j;->p:Lcom/facebook/yoga/j;

    return-object p0

    :pswitch_7
    sget-object p0, Lcom/facebook/yoga/j;->o:Lcom/facebook/yoga/j;

    return-object p0

    :pswitch_8
    sget-object p0, Lcom/facebook/yoga/j;->n:Lcom/facebook/yoga/j;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/yoga/j;
    .locals 1

    const-class v0, Lcom/facebook/yoga/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/yoga/j;

    return-object p0
.end method

.method public static values()[Lcom/facebook/yoga/j;
    .locals 1

    sget-object v0, Lcom/facebook/yoga/j;->w:[Lcom/facebook/yoga/j;

    invoke-virtual {v0}, [Lcom/facebook/yoga/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/yoga/j;

    return-object v0
.end method


# virtual methods
.method public j()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/yoga/j;->m:I

    return v0
.end method
