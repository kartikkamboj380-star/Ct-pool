.class public final Lcom/dooboolab/rniap/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/dooboolab/rniap/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/dooboolab/rniap/b;

    invoke-direct {v0}, Lcom/dooboolab/rniap/b;-><init>()V

    sput-object v0, Lcom/dooboolab/rniap/b;->a:Lcom/dooboolab/rniap/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/dooboolab/rniap/a;
    .locals 4

    .line 1
    const/16 v0, 0xc

    const-string v1, "E_NETWORK_ERROR"

    if-eq p1, v0, :cond_0

    const-string v0, "E_UNKNOWN"

    const-string v2, "E_SERVICE_ERROR"

    packed-switch p1, :pswitch_data_0

    new-instance v1, Lcom/dooboolab/rniap/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Purchase failed with code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/dooboolab/rniap/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_0
    new-instance v1, Lcom/dooboolab/rniap/a;

    const-string v0, "E_ALREADY_OWNED"

    const-string v2, "You already own this item."

    invoke-direct {v1, v0, v2}, Lcom/dooboolab/rniap/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_1
    new-instance v1, Lcom/dooboolab/rniap/a;

    const-string v2, "An unknown or unexpected error has occurred. Please try again later."

    invoke-direct {v1, v0, v2}, Lcom/dooboolab/rniap/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_2
    new-instance v1, Lcom/dooboolab/rniap/a;

    const-string v0, "E_DEVELOPER_ERROR"

    const-string v2, "Google is indicating that we have some issue connecting to payment."

    invoke-direct {v1, v0, v2}, Lcom/dooboolab/rniap/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_3
    new-instance v1, Lcom/dooboolab/rniap/a;

    const-string v0, "E_ITEM_UNAVAILABLE"

    const-string v2, "That item is unavailable."

    invoke-direct {v1, v0, v2}, Lcom/dooboolab/rniap/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_4
    new-instance v1, Lcom/dooboolab/rniap/a;

    const-string v0, "Billing is unavailable. This may be a problem with your device, or the Play Store may be down."

    invoke-direct {v1, v2, v0}, Lcom/dooboolab/rniap/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_5
    new-instance v1, Lcom/dooboolab/rniap/a;

    const-string v0, "The service is unreachable. This may be your internet connection, or the Play Store may be down."

    invoke-direct {v1, v2, v0}, Lcom/dooboolab/rniap/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_6
    new-instance v1, Lcom/dooboolab/rniap/a;

    const-string v0, "E_USER_CANCELLED"

    const-string v2, "Payment is Cancelled."

    invoke-direct {v1, v0, v2}, Lcom/dooboolab/rniap/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_7
    new-instance v1, Lcom/dooboolab/rniap/a;

    const-string v0, "OK"

    const-string v2, ""

    invoke-direct {v1, v0, v2}, Lcom/dooboolab/rniap/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_8
    new-instance v0, Lcom/dooboolab/rniap/a;

    const-string v2, "The service is disconnected (check your internet connection.)"

    invoke-direct {v0, v1, v2}, Lcom/dooboolab/rniap/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    move-object v1, v0

    goto :goto_1

    :pswitch_9
    new-instance v1, Lcom/dooboolab/rniap/a;

    const-string v0, "This feature is not available on your device."

    invoke-direct {v1, v2, v0}, Lcom/dooboolab/rniap/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/dooboolab/rniap/a;

    const-string v2, "You have problem with network connection."

    invoke-direct {v0, v1, v2}, Lcom/dooboolab/rniap/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error Code : "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "IapPromises"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_9
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

.method public final b(Lcom/facebook/react/bridge/Promise;I)V
    .locals 1

    .line 1
    const-string v0, "promise"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/dooboolab/rniap/b;->a(I)Lcom/dooboolab/rniap/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/dooboolab/rniap/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/dooboolab/rniap/a;->b()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Lcom/dooboolab/rniap/d;->b(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final c(Ljava/lang/String;I)V
    .locals 3

    .line 1
    const-string v0, "key"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/dooboolab/rniap/b;->a(I)Lcom/dooboolab/rniap/a;

    move-result-object p2

    sget-object v0, Lcom/dooboolab/rniap/c;->a:Lcom/dooboolab/rniap/c;

    invoke-virtual {p2}, Lcom/dooboolab/rniap/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/dooboolab/rniap/a;->b()Ljava/lang/String;

    move-result-object p2

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, p2, v2}, Lcom/dooboolab/rniap/c;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method
