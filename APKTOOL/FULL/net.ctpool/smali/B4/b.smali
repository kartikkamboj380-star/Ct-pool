.class public final synthetic LB4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb4/g;


# instance fields
.field public final synthetic a:Lb4/E;


# direct methods
.method public synthetic constructor <init>(Lb4/E;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB4/b;->a:Lb4/E;

    return-void
.end method


# virtual methods
.method public final a(Lb4/d;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LB4/b;->a:Lb4/E;

    invoke-static {v0, p1}, LB4/f;->e(Lb4/E;Lb4/d;)LB4/f;

    move-result-object p1

    return-object p1
.end method
