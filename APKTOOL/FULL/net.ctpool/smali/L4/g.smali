.class public final synthetic LL4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb4/g;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:LL4/h$a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;LL4/h$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL4/g;->a:Ljava/lang/String;

    iput-object p2, p0, LL4/g;->b:LL4/h$a;

    return-void
.end method


# virtual methods
.method public final a(Lb4/d;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LL4/g;->a:Ljava/lang/String;

    iget-object v1, p0, LL4/g;->b:LL4/h$a;

    invoke-static {v0, v1, p1}, LL4/h;->a(Ljava/lang/String;LL4/h$a;Lb4/d;)LL4/f;

    move-result-object p1

    return-object p1
.end method
