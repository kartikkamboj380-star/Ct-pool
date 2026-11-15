.class final Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->toString()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d$a;
    }
.end annotation


# static fields
.field public static final m:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d;

    invoke-direct {v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d;-><init>()V

    sput-object v0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d;->m:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lw5/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/facebook/react/common/mapbuffer/a$c;)Ljava/lang/CharSequence;
    .locals 3

    .line 1
    const-string v0, "entry"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Lcom/facebook/react/common/mapbuffer/a$c;->getKey()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lcom/facebook/react/common/mapbuffer/a$c;->getType()Lcom/facebook/react/common/mapbuffer/a$b;

    move-result-object v1

    sget-object v2, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-interface {p1}, Lcom/facebook/react/common/mapbuffer/a$c;->e()Lcom/facebook/react/common/mapbuffer/a;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :pswitch_1
    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lcom/facebook/react/common/mapbuffer/a$c;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :pswitch_2
    invoke-interface {p1}, Lcom/facebook/react/common/mapbuffer/a$c;->b()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    goto :goto_0

    :pswitch_3
    invoke-interface {p1}, Lcom/facebook/react/common/mapbuffer/a$c;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_0

    :pswitch_4
    invoke-interface {p1}, Lcom/facebook/react/common/mapbuffer/a$c;->d()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_0

    :pswitch_5
    invoke-interface {p1}, Lcom/facebook/react/common/mapbuffer/a$c;->f()Z

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/common/mapbuffer/a$c;

    invoke-virtual {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d;->a(Lcom/facebook/react/common/mapbuffer/a$c;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
